package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<CarDTO,String> {


}
