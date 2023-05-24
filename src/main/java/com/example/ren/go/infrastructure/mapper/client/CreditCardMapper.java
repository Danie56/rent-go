package com.example.ren.go.infrastructure.mapper.client;

import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.domain.entites.client.CreditCard;
import com.example.ren.go.infrastructure.dto.cient.ClientDTO;
import com.example.ren.go.infrastructure.dto.cient.CreditCardDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface CreditCardMapper {
    CreditCard toCreditCarEntity(CreditCardDTO creditCardDTO);

    CreditCardDTO toCreditCardDto(CreditCard creditCard);
}
