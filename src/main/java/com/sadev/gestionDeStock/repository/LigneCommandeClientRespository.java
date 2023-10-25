package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRespository extends JpaRepository<LigneCommandeClient, Integer> {
}
