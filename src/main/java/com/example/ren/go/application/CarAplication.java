package com.example.ren.go.application;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarAplication {

    private final CarService carService;
    public void saveCar(Car car){
        carService.saveCar(car);
    }
    public Car updateCar(Car car){
        return carService.updateCar(car);
    }
    public Car getCar(String id){
        return carService.getCar(id);
    }
    public List<Car> getAllCar(){
        return carService.getAllCar();
    }
    public void deleteCar(String id){
        carService.deleteCar(id);
    }
    public void setType(String idCar, String idType){
        carService.setType(idCar,idType);
    }
    public void setState(String idCar, String state){
        carService.setState(idCar,state);
    }




}

