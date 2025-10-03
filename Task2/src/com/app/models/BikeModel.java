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
public class BikeModel extends Vehicles {

String color;


    public BikeModel(String company, String model, String production_year, Double price, String color) {
        super(company, model, production_year, price);
        this.color=color;
    }
}
