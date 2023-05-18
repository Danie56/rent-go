package com.example.ren.go.infrastructure.adapter;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.entites.StatesCarEnum;
import com.example.ren.go.domain.service.CarService;
import com.example.ren.go.infrastructure.dto.CarDTO;
import com.example.ren.go.infrastructure.dto.DocumentDTO;
import com.example.ren.go.infrastructure.mapper.CarMapper;
import com.example.ren.go.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service

public class CarAdapter implements CarService {
    private  final CarRepository carRepository;
    private  final CarMapper carMapper;

    @Override
    public void saveCar(Car car) {
        carRepository.save(carMapper.toCarDto(car));

    }

    @Override
    public Car updateCar(Car car) {
        return carMapper.toCarEntity(carRepository.save(carMapper.toCarDto(car)));
    }
    @Override
    public Car getCar(String id) {

        Optional<CarDTO>carOptional = carRepository.findById(id);
        return carMapper.toCarEntity(carOptional.get());
    }

    @Override
    public List<Car> getAllCar() {
        List<CarDTO> peoples = carRepository.findAll();
        return peoples.stream().map(carMapper::toCarEntity).toList();
    }
    @Override

    public void deleteCar(String id) {

        carRepository.deleteById(id);
    }

    @Override
    public void setType(String idCar, String idType) {
        Optional<CarDTO>carOptional = carRepository.findById(idCar);
        Car car = carMapper.toCarEntity(carOptional.get());
        car.setIdType(idType);
        carRepository.save(carMapper.toCarDto(car));


    }
    public void setState(String idCar, String state) {
        Optional<CarDTO>carOptional = carRepository.findById(idCar);
        Car car = carMapper.toCarEntity(carOptional.get());
        car.setStatesCar(StatesCarEnum.valueOf(state));
        carRepository.save(carMapper.toCarDto(car));


    }
}
