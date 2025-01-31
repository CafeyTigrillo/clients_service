package com.mipagina.client_service.service;

import com.mipagina.client_service.model.Client;
import java.util.List;

public interface IClientService {

    public List<Client> getAllClients();
    public void saveClient(Client client);
    public void deleteClient(Long id_client);
    public Client findClient(Long id_client);
    public void editClient(Long idClient,Client client);

}
