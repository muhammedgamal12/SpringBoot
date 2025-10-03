package com.app.service;

import com.app.dao.BikeDAO;
import com.app.dao.CarDAO;
import com.app.dao.PlaneDAO;
import com.app.models.BikeModel;
import com.app.models.CarModel;
import com.app.models.PlaneModel;
import com.app.models.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class ModelsService {
    BikeDAO bikeDAO;
    PlaneDAO planeDAO;
    CarDAO carDAO;
    @Autowired
    public ModelsService(BikeDAO bikeDAO, PlaneDAO planeDAO, CarDAO carDAO) {
        this.bikeDAO = bikeDAO;
        this.planeDAO = planeDAO;
        this.carDAO = carDAO;
    }

    public void saveBike(Vehicles vehicles) throws SQLException {
        if (vehicles == null)
            System.out.println("There is no object");
        else
        bikeDAO.save(vehicles);
    }
    public void savePlane(Vehicles vehicles) throws SQLException {
        if (vehicles == null)
            System.out.println("There is no object");
        else
            planeDAO.save(vehicles);
    }
    public void saveCar(Vehicles vehicles) throws SQLException {
        if (vehicles == null)
            System.out.println("There is no object");
        else
            carDAO.save(vehicles);
    }

}
