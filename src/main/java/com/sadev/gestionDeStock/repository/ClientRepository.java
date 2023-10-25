package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
