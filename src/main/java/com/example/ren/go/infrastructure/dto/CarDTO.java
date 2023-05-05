package com.example.ren.go.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class CarDTO {
    @Id
    private  String plate;
    private  String model;
    private  String brand;
    private  String year;
    private  String type;
    private  Double basePrice;
}
