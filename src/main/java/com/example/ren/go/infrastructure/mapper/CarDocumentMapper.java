package com.example.ren.go.infrastructure.mapper;

import com.example.ren.go.domain.entites.Car;
import com.example.ren.go.domain.entites.CarDocument;
import com.example.ren.go.domain.service.CarDocumentService;
import com.example.ren.go.infrastructure.dto.CarDTO;
import com.example.ren.go.infrastructure.dto.CarDocumentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CarDocumentMapper {
    CarDocument toCarDocumentEntity(CarDocumentDTO carDocumentDTO);
    CarDocumentDTO toCarDocumentDto(CarDocument carDocument);
}