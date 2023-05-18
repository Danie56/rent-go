package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.CarTypeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeRepository extends JpaRepository<CarTypeDTO,Integer> {
}
