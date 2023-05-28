package com.example.ren.go.domain.entites.rent;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Rent {

     private Long  id;
    private String idClient;
    private String idCar;
    private LocalDateTime departureDate;
    private LocalDateTime  entryDate;
    private double  price;
    private boolean isRentClosed;




}
