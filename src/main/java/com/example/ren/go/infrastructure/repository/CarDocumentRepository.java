package com.example.ren.go.infrastructure.repository;

import com.example.ren.go.infrastructure.dto.CarDocumentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDocumentRepository extends JpaRepository<CarDocumentDTO , Integer> {
}
