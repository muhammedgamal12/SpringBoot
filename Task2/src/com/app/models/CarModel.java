package com.app.models;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@Scope("prototype")
public class CarModel extends Vehicles {

  String speed;


  public CarModel(String company, String model, String production_year, Double price,String speed) {
    super(company, model, production_year, price);
    this.speed=speed;
  }
}
