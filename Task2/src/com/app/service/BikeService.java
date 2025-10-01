package com.app.service;

import com.app.dao.BikeDAO;
import com.app.dao.CarDAO;
import com.app.models.BikeModel;
import com.app.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class BikeService {


    @Autowired
    BikeDAO bikeDAO;

    public void save(BikeModel bikeModel) throws SQLException {
        if (bikeModel == null)
            System.out.println("There is no object");
        else
        bikeDAO.save(bikeModel);
    }
}
