package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.CarDocumentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDocumentRepository extends JpaRepository<CarDocumentDTO , Integer> {
    @Modifying
    @Query("DELETE FROM CarDocumentDTO u WHERE u.idCar = ?1 ")
    void deleteCarDocument(String idCar);


}
