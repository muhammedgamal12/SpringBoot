package com.app.dao;

import com.app.config.DatabaseConfig;
import com.app.models.BikeModel;
import com.app.models.CarModel;
import com.app.models.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class BikeDAO {

    @Autowired
    DatabaseConfig databaseConfig ;

    public void save(Vehicles vehicles) throws SQLException {
        String sql = "INSERT INTO vehicle VALUES (?,?,?,?,?)";

        BikeModel bikeModel = (BikeModel) vehicles;
        PreparedStatement p = databaseConfig.connectDB().prepareStatement(sql);

        p.setString(1,bikeModel.getCompany());
        p.setString(2,bikeModel.getModel());
        p.setString(3,bikeModel.getProduction_year());
        p.setDouble(4,bikeModel.getPrice());
        p.setString(5,bikeModel.getColor());





        p.executeUpdate();

        p.close();
    }
}
