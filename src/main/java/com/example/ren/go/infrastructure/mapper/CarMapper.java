package com.example.ren.go.infrastructure.mapper;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.infrastructure.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CarMapper {

    Car toCarEntity(CarDTO peopleDTO);

    CarDTO toCarDto(Car people);
}
