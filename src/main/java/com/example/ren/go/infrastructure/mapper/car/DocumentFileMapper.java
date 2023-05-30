package com.example.ren.go.infrastructure.mapper.car;

import com.example.ren.go.domain.entites.car.DocumentFile;
import com.example.ren.go.domain.entites.rent.Rent;
import com.example.ren.go.infrastructure.dto.car.DocumentFileDTO;
import com.example.ren.go.infrastructure.dto.rent.RentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface DocumentFileMapper {
    DocumentFile toEntity(DocumentFileDTO documentFileDTO);
    DocumentFileDTO toDto(DocumentFile documentFile);
}
