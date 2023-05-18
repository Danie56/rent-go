package com.example.ren.go.domain.entites;

import lombok.Data;

@Data
public class Car {
    private  String plate;
    private  String model;
    private  String brand;
    private  String year;
    private  Long mileage;
    private  String idType;
    private StatesCarEnum statesCar;
    private  Double basePrice;
}
