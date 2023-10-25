package com.sadev.gestionDeStock.repository;

import com.sadev.gestionDeStock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
