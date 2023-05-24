package com.example.ren.go.infrastructure.repository.client;

import com.example.ren.go.infrastructure.dto.cient.ClientDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientDTO,String> {
}
