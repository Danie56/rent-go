package com.example.ren.go.infrastructure.mapper.car;

import com.example.ren.go.domain.entites.car.CarType;
import com.example.ren.go.infrastructure.dto.car.CarTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CarTypeMapper {
    CarType toCarTypeEntity(CarTypeDTO carTypeTypeDTO);

    CarTypeDTO toCarTypeDto(CarType carType);
}
