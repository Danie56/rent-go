package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.CarAplication;
import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.entites.Document;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class CarController {
    private CarAplication carAplication;

    @PostMapping("/save_car")
    public String saveCar (@RequestBody Car car) {

        carAplication.saveCar(car);
        return car.getPlate();

    }
    @PutMapping("/update_car")
    public ResponseEntity<Car> updateCar (@RequestBody Car car) {
        return new ResponseEntity<>(carAplication.updateCar(car),HttpStatus.OK);


    }
    @GetMapping("/get_car/{id}")
    public ResponseEntity<Car> getCar (@PathVariable  String id) {
        return new ResponseEntity<>(carAplication.getCar(id),HttpStatus.OK);


    }
    @GetMapping("/get_all_car")
    public ResponseEntity<List<Car>> getDocument(){
        return new ResponseEntity<>(carAplication.getAllCar(), HttpStatus.OK);

    }
    @DeleteMapping("/delete_car/{id}")
    public void deleteCar (@PathVariable  String id) {
        carAplication.deleteCar(id);


    }



}
