package com.example.ren.go.application.client;

import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.domain.entites.client.CreditCard;
import com.example.ren.go.domain.service.client.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientAplication {

    private final ClientService clientService;
    public void saveClient(Client client){
        clientService.saveClient(client);
    }
    public Client getClient(String id){
        return clientService.getClient(id);
    }
    public void setCreditCard(String id, String idCredidCard){
        clientService.setCreditCard(id,idCredidCard);
    }
    public void saveCreditCar(CreditCard creditCard){
        clientService.saveCreditCard(creditCard);
    }



}
