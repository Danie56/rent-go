package com.example.ren.go.application;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.service.CarService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarAplication {

    private final CarService carService;
    public void saveCar(Car car){
        carService.saveCar(car);
    }




}

