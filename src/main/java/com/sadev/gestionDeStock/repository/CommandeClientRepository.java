package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {
}
