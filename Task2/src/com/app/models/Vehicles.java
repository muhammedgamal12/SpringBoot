package com.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public abstract class Vehicles {

    String company;
    String model;
    String production_year;
    Double price;



}
