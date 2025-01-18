package com.mipagina.client_service.repository;

import com.mipagina.client_service.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client,Long> {
}
