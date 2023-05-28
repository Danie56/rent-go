package com.example.ren.go.infrastructure.dto.rent;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class RentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String idClient;
    private String idCar;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime departureDate;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime  entryDate;
    private double  price;
    private boolean isRentClosed;
    @Transient
    public String getFormattedId() {
        return String.format("%02d", id);
    }
    @PrePersist
    private void pre () {

        this.isRentClosed = false;





    }





}
