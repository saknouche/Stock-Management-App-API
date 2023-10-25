package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeFournisseurRespository extends JpaRepository<LigneCommandeFournisseur, Integer> {
}
