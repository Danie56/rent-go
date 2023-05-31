package com.example.ren.go.domain.service.client;

import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.domain.entites.client.CreditCard;

public interface ClientService {

    void saveClient(Client client);
    Client getClient(String id);
    void setCreditCard(String id,String idCreditCard);
    String saveCreditCard(CreditCard creditCard);

}
