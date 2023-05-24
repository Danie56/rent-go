package com.example.ren.go.infrastructure.repository.client;

import com.example.ren.go.infrastructure.dto.cient.CreditCardDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository <CreditCardDTO, String>{
}
