package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.TypeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeDTO, String> {
}
