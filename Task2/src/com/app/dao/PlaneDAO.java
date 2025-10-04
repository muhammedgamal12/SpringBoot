package com.app.dao;

import com.app.config.DatabaseConfig;
import com.app.models.CarModel;
import com.app.models.PlaneModel;
import com.app.models.Vehicles;
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

    public void save(Vehicles vehicles) throws SQLException {
        String sql = "INSERT INTO vehicle VALUES (?,?,?,?,?)";
        PlaneModel planeModel = (PlaneModel) vehicles;

        PreparedStatement p = databaseConfig.connectDB().prepareStatement(sql);

        p.setString(1,planeModel.getCompany());
        p.setString(2,planeModel.getModel());
        p.setString(3,planeModel.getProduction_year());
        p.setDouble(4, planeModel.getPrice());
        p.setString(5, String.valueOf(planeModel.getRate()));


        p.executeUpdate();

        p.close();
    }
}
