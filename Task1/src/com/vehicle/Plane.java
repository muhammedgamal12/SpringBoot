package com.vehicle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Plane implements Vehicles{
    String name;
    String brand;

    DatabaseOperations databaseOperations;

    public Plane() {
    }

    public void setDatabaseOperations(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public Plane(String name, String brand) {
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

    public Plane(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    @Override
    public void saveVehicle(Vehicles vehicles) throws SQLException {
        String sql = "INSERT INTO vechicles VALUES ('pl','plane')";
        DatabaseOperations.saveData(vehicles,sql);
    }
}
