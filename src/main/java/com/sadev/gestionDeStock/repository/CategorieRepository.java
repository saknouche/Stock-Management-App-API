package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
