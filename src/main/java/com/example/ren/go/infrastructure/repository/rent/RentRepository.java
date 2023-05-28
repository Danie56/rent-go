package com.example.ren.go.infrastructure.repository.rent;

import com.example.ren.go.infrastructure.dto.rent.RentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<RentDTO,Long> {
}
