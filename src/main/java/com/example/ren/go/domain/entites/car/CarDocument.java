package com.example.ren.go.domain.entites.car;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
public class CarDocument {
    private Integer id;
    private String idCar;
    private String idDocument;
    private Boolean isChecked ;


}
