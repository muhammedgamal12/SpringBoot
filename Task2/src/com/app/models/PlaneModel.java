package com.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Scope("prototype")
public class PlaneModel extends Vehicles {

    Rate rate;


    public PlaneModel(String company, String model, String production_year, Double price ,Rate rate) {
        super(company, model, production_year, price);
        this.rate =rate;
    }
}
