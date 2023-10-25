package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Integer> {
}
