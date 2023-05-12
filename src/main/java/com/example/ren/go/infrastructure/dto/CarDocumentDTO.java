package com.example.ren.go.infrastructure.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Entity
@Data
public class CarDocumentDTO {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String  idCar;
    private String idDocument;
    private Boolean isChecked ;





}
