package com.app.service;

import com.app.dao.CarDAO;
import com.app.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class CarService {


    CarDAO carDAO;

    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public void save(CarModel carModel) throws SQLException {
        if (carModel == null)
            System.out.println("There is no object");
        else
        carDAO.save(carModel);
    }
}
