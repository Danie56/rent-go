package com.example.ren.go.application.car;

import com.example.ren.go.domain.entites.car.Car;
import com.example.ren.go.domain.service.car.CarService;
import lombok.AllArgsConstructor;
import org.bson.Document;
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
    public List<Document> getDocumentsByCar(String idCar){
        return carService.getDocumentsByCar(idCar);
    }




}

