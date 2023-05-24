package com.example.ren.go.infrastructure.api.controller.client;

import com.example.ren.go.application.client.ClientAplication;
import com.example.ren.go.domain.entites.car.Document;
import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.domain.entites.client.CreditCard;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {

    private ClientAplication clientAplication;
    @PostMapping("/save_client")
    public String saveType(@RequestBody Client client){

        clientAplication.saveClient(client);
        return client.getCc();
    }
    @GetMapping("/get_client/{id}")
    public ResponseEntity<Client> getType(@PathVariable String id){
        return new ResponseEntity<>(clientAplication.getClient(id), HttpStatus.OK);

    }
    @PutMapping("/set_credit_card")
            public void updateDocument(@Param("id") String id, @Param("idCreditCard") String idCreditCard){
        clientAplication.setCreditCard(id,idCreditCard);
    }
    @PostMapping("/save_credit_card")
    public void saveCreditCard(@RequestBody CreditCard  creditCard){
        clientAplication.saveCreditCar(creditCard);
    }
}
