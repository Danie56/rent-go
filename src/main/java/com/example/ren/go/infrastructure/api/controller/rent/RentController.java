package com.example.ren.go.infrastructure.api.controller.rent;

import com.example.ren.go.application.rent.RentAplication;
import com.example.ren.go.domain.entites.rent.Rent;
import com.example.ren.go.exceptions.ThisCarIsRent;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class RentController {
    private RentAplication rentAplication;

    @PostMapping("/rent")
    public void saveRent(@RequestBody Rent rent) throws ThisCarIsRent {

        rentAplication.rent(rent);


    }
    @PutMapping("/close_rent")
    public void saveRent(@Param("id") Long id){

        rentAplication.closeRent(id);


    }







}
