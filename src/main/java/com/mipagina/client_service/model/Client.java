package com.mipagina.client_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the client", example = "1")
    private Long id_client;

    @Schema(description = "First name of the client", example = "John", required = true)
    private String name;

    @Schema(description = "Last name of the client", example = "Doe", required = true)
    private String lastname;

    @Schema(description = "Address of the client", example = "123 Main Street, NY", required = true)
    private String address;

    @Schema(description = "Phone number of the client", example = "+1 123 456 7890", required = true)
    private String phone;

    @Schema(description = "National identification number (DNI)", example = "12345678", required = true)
    private String dni;

    @Schema(description = "Email address of the client", example = "john.doe@example.com", required = true)
    private String email;

    public Long getId_client() {
        return id_client;
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client() {
    }

    public Client(Long id_client, String name, String lastname, String address, String phone, String dni, String email) {
        this.id_client = id_client;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.dni = dni;
        this.email = email;
    }
}
