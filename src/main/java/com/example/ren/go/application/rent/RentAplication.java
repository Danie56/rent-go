package com.example.ren.go.application.rent;

import com.example.ren.go.domain.entites.rent.Rent;
import com.example.ren.go.domain.service.rent.RentService;
import com.example.ren.go.exceptions.ThisCarIsRent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentAplication {
    private final RentService rentService;
    public void rent(Rent rent) throws ThisCarIsRent {
        rentService.rent(rent);

    }
    public void closeRent(Long id){
        rentService.closeRent(id);

    }
}
