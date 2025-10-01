package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) throws SQLException {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = container.getBean("car",Car.class);
        car.saveVehicle(car);

        Plane plane = container.getBean("plane",Plane.class);
        plane.saveVehicle(plane);


    }
}