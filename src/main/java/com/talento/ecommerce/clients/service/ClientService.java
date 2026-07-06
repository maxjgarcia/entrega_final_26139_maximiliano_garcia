package com.talento.ecommerce.clients.service;

import com.talento.ecommerce.clients.model.Client;
import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> listClients();
    Optional<Client> findClientById(Long id);
    Client saveClient(Client client);
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);

} 