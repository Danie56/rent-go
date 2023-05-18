package com.example.ren.go.infrastructure.dto.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CarTypeDTO {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String idCar;
    private String idType;



}
