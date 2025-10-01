package com.app.service;

import com.app.dao.CarDAO;
import com.app.dao.PlaneDAO;
import com.app.models.CarModel;
import com.app.models.PlaneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class PlaneService {


    PlaneDAO planeDAO;

    @Autowired
    public void setPlaneDAO(PlaneDAO planeDAO) {
        this.planeDAO = planeDAO;
    }

    public void save(PlaneModel planeModel) throws SQLException {
        if (planeModel == null)
            System.out.println("There is no object");
        else
        planeDAO.save(planeModel);
    }
}
