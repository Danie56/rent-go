package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.CarAplication;
import com.example.ren.go.domain.entites.Car;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class CarController {
    private CarAplication carAplication;

    @PostMapping("/save_car")
    public void saveCar (@RequestBody Car car) {

        carAplication.saveCar(car);

    }


}
