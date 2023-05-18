package com.example.ren.go.infrastructure.dto.car;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class DocumentDTO {

    @Id
    private String id;
    private String name;

    @PrePersist
    private void generateId() {
        this.id = UUID.randomUUID().toString().substring(0, 9);
    }



}
