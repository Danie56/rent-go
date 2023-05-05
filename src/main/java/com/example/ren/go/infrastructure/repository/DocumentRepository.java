package com.example.ren.go.infrastructure.repository;

import com.example.ren.go.infrastructure.dto.DocumentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentDTO, String> {
}
