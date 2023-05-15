package com.example.ren.go.domain.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CarType {
    private Integer id;
    private String idCar;
    private String idType;



}
