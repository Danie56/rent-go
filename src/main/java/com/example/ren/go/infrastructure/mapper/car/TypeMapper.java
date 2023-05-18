package com.example.ren.go.infrastructure.mapper.car;

import com.example.ren.go.domain.entites.car.Type;
import com.example.ren.go.infrastructure.dto.car.TypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface TypeMapper {
    Type toTypeEntity(TypeDTO typeDTO);

    TypeDTO toTypeDto(Type type);
}
