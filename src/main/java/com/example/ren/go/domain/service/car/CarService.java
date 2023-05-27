package com.example.ren.go.domain.service.car;

import com.example.ren.go.domain.entites.car.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);
    Car updateCar(Car car);
    Car getCar(String id);
    List<Car> getAllCar();
    void deleteCar(String id);
    void setType(String  idCar,String idType);
    void setState(String idCar, String state);




}
