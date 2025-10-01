package com.app.dao;

import com.app.config.DatabaseConfig;
import com.app.models.CarModel;
import com.app.models.PlaneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class PlaneDAO {

    DatabaseConfig databaseConfig ;


    @Autowired
    public void setDatabaseConfig(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    public void save(PlaneModel planeModel) throws SQLException {
        String sql = "INSERT INTO vehicle (company,model,production_year,price) VALUES (?,?,?,?)";

        PreparedStatement p = databaseConfig.connectDB().prepareStatement(sql);

        p.setString(1,planeModel.getCompany());
        p.setString(2,planeModel.getModel());
        p.setString(3,planeModel.getProduction_year());
        p.setDouble(4, planeModel.getPrice());

        p.executeUpdate();

        p.close();
    }
}
