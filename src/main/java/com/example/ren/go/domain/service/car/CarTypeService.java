package com.example.ren.go.domain.service.car;

import com.example.ren.go.domain.entites.car.CarType;

public interface CarTypeService {
    void saveCarType(CarType carType);
    void deleteCarTypeByCar(String idCar, String idType);

}
