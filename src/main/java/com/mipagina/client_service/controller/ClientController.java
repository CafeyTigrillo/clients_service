package com.mipagina.client_service.controller;

import com.mipagina.client_service.model.Client;
import com.mipagina.client_service.service.IClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @Operation(summary = "Retrieve a client by ID", description = "Returns a client based on the provided client ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Client found successfully"),
            @ApiResponse(responseCode = "404", description = "Client not found")
    })
    @GetMapping("/bring/{id_client}")
    public Client bringClient(
            @Parameter(description = "ID of the client to retrieve", example = "1", required = true)
            @PathVariable Long id_client) {
        return clientService.findClient(id_client);
    }

    @Operation(summary = "Create a new client", description = "Adds a new client to the system.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Client created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid client data")
    })
    @PostMapping("/create")
    public String createClient(
            @Parameter(description = "Client object to be created", required = true)
            @RequestBody Client client) {
        clientService.saveClient(client);
        return "client created successfully";
    }

    @Operation(summary = "Delete a client", description = "Removes a client from the system using the provided ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Client deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Client not found")
    })
    @DeleteMapping("/delete/{id_client}")
    public String deleteclient(
            @Parameter(description = "ID of the client to delete", example = "1", required = true)
            @PathVariable Long id_client) {
        clientService.deleteClient(id_client);
        return "client deleted successfully";
    }

    @Operation(summary = "Retrieve all clients", description = "Returns a list of all clients in the system.")
    @ApiResponse(responseCode = "200", description = "Clients retrieved successfully")
    @GetMapping("/bring_all")
    public List<Client> bringAllClients() {
        return clientService.getAllClients();
    }

    @Operation(summary = "Edit client details", description = "Updates the information of an existing client.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Client edited successfully"),
            @ApiResponse(responseCode = "404", description = "Client not found")
    })
    @PutMapping("/edit/{id_client}")
    public String editClient(
            @Parameter(description = "ID of the client to edit", example = "1", required = true)
            @PathVariable Long id_client,
            @Parameter(description = "Updated client data", required = true)
            @RequestBody Client client) {
        clientService.editClient(id_client, client);
        return "client edited successfully";
    }
}
