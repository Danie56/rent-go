package com.example.ren.go.domain.service.rent;

import com.example.ren.go.domain.entites.rent.Rent;
import com.example.ren.go.exceptions.ThisCarIsRent;

public interface RentService {
    void rent  (Rent rent) throws ThisCarIsRent;
    void closeRent(Long id);
}
