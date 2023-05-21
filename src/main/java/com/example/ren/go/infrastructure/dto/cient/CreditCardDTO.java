package com.example.ren.go.infrastructure.dto.cient;

import com.example.ren.go.domain.entites.client.CardTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CreditCardDTO {
    @Id
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String securityCode;
    @Enumerated(EnumType.STRING)
    @Column(name = "type_card")
    private CardTypeEnum cardType;






}
