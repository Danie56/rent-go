package com.example.ren.go.application;

import com.example.ren.go.domain.entites.CarDocument;
import com.example.ren.go.domain.entites.CarType;
import com.example.ren.go.domain.service.CarDocumentService;
import com.example.ren.go.domain.service.CarTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarTypeAplication {
    private final CarTypeService carTypeService;
    public void saveCarType (CarType carType){
        carTypeService.saveCarType(carType);
    }
    public void deleteCarTypeByCar (String idCar, String idType){
        carTypeService.deleteCarTypeByCar(idCar,idType);
    }
}
