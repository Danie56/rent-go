package com.example.ren.go.infrastructure.mapper.rent;

import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.domain.entites.rent.Rent;
import com.example.ren.go.infrastructure.dto.cient.ClientDTO;
import com.example.ren.go.infrastructure.dto.rent.RentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface RentMapper {
    Rent toEntity(RentDTO rentDTO);

    RentDTO toDto(Rent rent);
}
