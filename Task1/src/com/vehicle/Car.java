package com.vehicle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Car implements Vehicles{
    String name;
    String brand;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    DatabaseOperations databaseOperations;

    public Car(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    @Override
    public void saveVehicle(Vehicles car) throws SQLException {

        String sql = "INSERT INTO vechicles VALUES ('mercedes','car')";
        DatabaseOperations.saveData(car,sql);
    }
}
