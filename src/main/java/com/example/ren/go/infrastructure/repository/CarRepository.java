package com.example.ren.go.infrastructure.repository;

import com.example.ren.go.infrastructure.dto.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<CarDTO,String> {


}
