package com.example.ren.go.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
@Entity
public class CarDocumentDTO {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String idCar;
    private String idDocument;
    private Boolean isChecked ;

}
