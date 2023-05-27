package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.DocumentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DocumentRepository extends JpaRepository<DocumentDTO, String> {




}
