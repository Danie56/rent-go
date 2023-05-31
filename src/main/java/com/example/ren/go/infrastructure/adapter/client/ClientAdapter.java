package com.example.ren.go.infrastructure.adapter.client;

import com.example.ren.go.domain.entites.client.Client;
import com.example.ren.go.domain.entites.client.CreditCard;
import com.example.ren.go.domain.service.client.ClientService;
import com.example.ren.go.infrastructure.dto.cient.ClientDTO;
import com.example.ren.go.infrastructure.dto.cient.CreditCardDTO;
import com.example.ren.go.infrastructure.mapper.client.ClientMapper;
import com.example.ren.go.infrastructure.mapper.client.CreditCardMapper;
import com.example.ren.go.infrastructure.repository.client.ClientRepository;
import com.example.ren.go.infrastructure.repository.client.CreditCardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientAdapter implements ClientService {
    private final ClientRepository clientRepository;
    private final CreditCardRepository creditCardRepository;
    private final ClientMapper clientMapper;
    private final CreditCardMapper creditCardMapper;

    @Override
    public void saveClient(Client client) {
        clientRepository.save(clientMapper.toClientDto(client));




    }

    @Override
    public Client getClient(String id) {
        Optional<ClientDTO> clientDTOOptional = clientRepository.findById(id);

        return clientMapper.toClientEntity(clientDTOOptional.get());

    }

    @Override
    public void setCreditCard(String id, String idCreditCard) {
        Optional<ClientDTO> clientDTOOptional = clientRepository.findById(id);
        Optional<CreditCardDTO> creditCardDTO = creditCardRepository.findById(idCreditCard);
        Client client = clientMapper.toClientEntity(clientDTOOptional.get());
        CreditCard creditCard = creditCardMapper.toCreditCarEntity(creditCardDTO.get());
        creditCard.setCardHolderName(client.getFullName());
        client.setIdCreditCard(idCreditCard);
        clientRepository.save(clientMapper.toClientDto(client));
        creditCardRepository.save(creditCardMapper.toCreditCardDto(creditCard));

    }

    @Override
    public String saveCreditCard(CreditCard creditCard) {

        creditCardRepository.save(creditCardMapper.toCreditCardDto(creditCard));
        return creditCard.getCardNumber();

    }
}
