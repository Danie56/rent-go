package com.example.ren.go.infrastructure.adapter;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.service.CarService;
import com.example.ren.go.infrastructure.mapper.CarMapper;
import com.example.ren.go.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class CarAdapter implements CarService {
    private  final CarRepository carRepository;
    private  final CarMapper carMapper;

    @Override
    public void saveCar(Car car) {
        carRepository.save(carMapper.toCarDto(car));

    }
}
