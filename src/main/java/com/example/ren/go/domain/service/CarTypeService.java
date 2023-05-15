package com.example.ren.go.domain.service;

import com.example.ren.go.domain.entites.CarDocument;
import com.example.ren.go.domain.entites.CarType;

public interface CarTypeService {
    void saveCarType(CarType carType);
    void deleteCarTypeByCar(String idCar, String idType);

}
