package com.example.ren.go.infrastructure.dto.car;

import com.example.ren.go.domain.entites.car.StatesCarEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class CarDTO {
    @Id
    private  String plate;
    private  String model;
    private  String brand;
    private  String year;
    private  Long mileage;
    private  String idType;
    @Enumerated(EnumType.STRING)
    @Column(name = "states_car")
    private StatesCarEnum statesCar;
    private  Double basePrice;


}
