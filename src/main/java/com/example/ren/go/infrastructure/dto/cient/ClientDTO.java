package com.example.ren.go.infrastructure.dto.cient;

import com.example.ren.go.domain.entites.client.TypeLicenseEnum;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class ClientDTO {

    @Id
    private String cc;
    private String fullName;
    private String mail;
    @Enumerated(EnumType.STRING)
    @Column(name = "type_license")
    private TypeLicenseEnum typeLicense;
    private String idCreditCard ;







}
