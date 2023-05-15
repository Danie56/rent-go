package com.example.ren.go.infrastructure.mapper;

import com.example.ren.go.domain.entites.CarType;
import com.example.ren.go.domain.entites.Type;
import com.example.ren.go.infrastructure.dto.CarTypeDTO;
import com.example.ren.go.infrastructure.dto.TypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CarTypeMapper {
    CarType toCarTypeEntity(CarTypeDTO carTypeTypeDTO);

    CarTypeDTO toCarTypeDto(CarType carType);
}
