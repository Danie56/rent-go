package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.DocumentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentDTO, String> {

}
