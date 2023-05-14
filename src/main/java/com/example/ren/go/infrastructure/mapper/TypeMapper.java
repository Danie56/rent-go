package com.example.ren.go.infrastructure.mapper;

import com.example.ren.go.domain.entites.Document;
import com.example.ren.go.domain.entites.Type;
import com.example.ren.go.infrastructure.dto.DocumentDTO;
import com.example.ren.go.infrastructure.dto.TypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface TypeMapper {
    Type toTypeEntity(TypeDTO typeDTO);

    TypeDTO toTypeDto(Type type);
}
