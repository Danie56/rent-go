package com.example.ren.go.infrastructure.repository;

import com.example.ren.go.infrastructure.dto.TypeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeDTO, String> {
}
