# 🏢 Client Service API

> A powerful REST API built with Spring Boot for managing client data efficiently.

## 🚀 Overview
Modern and scalable microservice designed to handle client information through a set of RESTful endpoints. Built with Spring Boot and JPA, this service provides a robust solution for client data management.

## 💻 Tech Stack
- Spring Boot
- Java
- JPA (Java Persistence API)

## 🌟 Features

### API Endpoints

- **GET** `/clients/bring/{id_client}` - Retrieve specific client
- **POST** `/clients/create` - Create new client
- **DELETE** `/clients/delete/{id_client}` - Remove client
- **GET** `/clients/bring_all` - List all clients
- **PUT** `/clients/edit/{id_client}` - Update client info

### 📋 Client Data Model
```java
Client {
    Long id_client
    String name
    String lastname
    String address
    String phone
    String dni
    String email
}
```
🗂 Project Structure
```java
com.mipagina.client_service/
├── 📄 ClientServiceApplication.java
├── 📁 controller/
│   └── ClientController.java
├── 📁 model/
│   └── Client.java
└── 📁 repository/
    └── IClientRepository.java
```
