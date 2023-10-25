package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
