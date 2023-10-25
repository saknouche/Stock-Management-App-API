package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<MvtStk, Integer> {
}
