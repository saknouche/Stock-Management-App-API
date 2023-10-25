package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {
}
