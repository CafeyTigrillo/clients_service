package com.mipagina.client_service.controller;

import com.mipagina.client_service.model.Client;
import com.mipagina.client_service.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/bring/{id_client}")
    public Client bringClient(@PathVariable Long id_client){
        return clientService.findClient(id_client);
    }

    @PostMapping("/create")
    public String createClient(@RequestBody Client client){
        clientService.saveClient(client);
        return "client created successfully";
    }

    @DeleteMapping("/delete/{id_client}")
    public String deleteclient(@PathVariable Long id_client){
        clientService.deleteClient(id_client);
        return "client deleted successfully";
    }

    @GetMapping("/bring_all")
    public List<Client> bringAllClients (){
        return clientService.getAllClients();
    }

    @PutMapping("/edit/{id_client}")
    public String editClient(@PathVariable Long id_client,
                            @RequestBody Client client){

        clientService.editClient(id_client,client);
        return "client edited successfully";
    }

}
