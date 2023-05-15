package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.CarTypeAplication;
import com.example.ren.go.domain.entites.CarType;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")


public class CarTypeController {
    private final CarTypeAplication carTypeAplication;

    @PostMapping("/save_car_type")
    public void saveType(@RequestBody CarType carType){
        carTypeAplication.saveCarType(carType);
    }
    @DeleteMapping("/delete_car_type_by_car")
    public void deleteType(@Param("idCar") String idCar, @Param("idType")String idType){
        carTypeAplication.deleteCarTypeByCar(idCar, idType);
    }
}
