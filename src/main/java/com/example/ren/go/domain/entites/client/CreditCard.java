package com.example.ren.go.domain.entites.client;

import lombok.Data;

@Data
public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String securityCode;
    private CardTypeEnum cardType;









}
