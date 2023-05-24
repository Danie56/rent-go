package com.example.ren.go.infrastructure.mapper.client;
import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.infrastructure.dto.cient.ClientDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface ClientMapper {

    Client toClientEntity(ClientDTO clientDTO);

    ClientDTO toClientDto(Client client);
}
