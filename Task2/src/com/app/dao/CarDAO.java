package com.app.dao;

import com.app.config.DatabaseConfig;
import com.app.models.CarModel;
import com.app.models.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class CarDAO  {

    DatabaseConfig databaseConfig ;

    @Autowired
    public CarDAO(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }


    public void save(Vehicles vehicles) throws SQLException {
        String sql = "INSERT INTO vehicle  VALUES (?,?,?,?,?)";
        CarModel carModel = (CarModel) vehicles;

        PreparedStatement p = databaseConfig.connectDB().prepareStatement(sql);

        p.setString(1,carModel.getCompany());
        p.setString(2,carModel.getModel());
        p.setString(3,carModel.getProduction_year());
        p.setDouble(4,carModel.getPrice());
        p.setString(5,carModel.getSpeed());


        p.executeUpdate();

        p.close();

    }
}
