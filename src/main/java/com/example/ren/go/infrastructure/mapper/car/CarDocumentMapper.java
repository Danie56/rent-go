package com.example.ren.go.infrastructure.mapper.car;

import com.example.ren.go.domain.entites.car.CarDocument;
import com.example.ren.go.infrastructure.dto.car.CarDocumentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CarDocumentMapper {
    CarDocument toCarDocumentEntity(CarDocumentDTO carDocumentDTO);
    CarDocumentDTO toCarDocumentDto(CarDocument carDocument);
}