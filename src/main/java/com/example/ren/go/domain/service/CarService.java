package com.example.ren.go.domain.service;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.entites.StatesCarEnum;

import java.util.List;

public interface CarService {
    void saveCar(Car car);
    Car updateCar(Car car);
    Car getCar(String id);
    List<Car> getAllCar();
    void deleteCar(String id);
    void setType(String idCar,String idType);
    void setState(String idCar, String state);




}
