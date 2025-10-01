package com.app.models;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Scope("prototype")
public class CarModel {

    String company;
    String model;
    String production_year;
    Double price;


}
