package com.example.ren.go.infrastructure.dto;

import com.example.ren.go.domain.entites.StatesCarEnum;
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
    @Column(name = "satates_car")
    private StatesCarEnum statesCar;
    private  Double basePrice;


}
