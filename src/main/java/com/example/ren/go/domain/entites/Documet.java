package com.example.ren.go.domain.entites;

import jakarta.persistence.PrePersist;
import lombok.Data;

import java.util.UUID;

@Data
public class Documet {
    private String id;
    private String name;



}
