package com.example.ren.go.infrastructure.mapper.car;

import com.example.ren.go.domain.entites.car.Car;
import com.example.ren.go.infrastructure.dto.car.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CarMapper {

    Car toCarEntity(CarDTO carDTO);

    CarDTO toCarDto(Car car);
}
