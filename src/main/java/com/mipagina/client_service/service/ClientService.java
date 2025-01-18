package com.mipagina.client_service.service;

import com.mipagina.client_service.model.Client;
import com.mipagina.client_service.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService{

    @Autowired
    private IClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id_client) {
        clientRepository.deleteById(id_client);
    }

    @Override
    public Client findClient(Long id_client) {
        return clientRepository.findById(id_client).orElse(null);
    }

    @Override
    public void editClient(Long idClient, Client client) {
        Client client1=this.findClient(idClient);
        client1.setId_client(idClient);
        client1.setName(client.getName());
        client1.setLastname(client.getLastname());
        client1.setAddress(client.getAddress());
        client1.setPhone(client.getPhone());
        client1.setDni(client.getDni());
        client1.setEmail(client.getEmail());
        this.saveClient(client1);
    }
}
