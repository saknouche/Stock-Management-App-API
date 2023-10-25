package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
}
