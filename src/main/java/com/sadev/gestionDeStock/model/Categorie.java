package com.sadev.gestionDeStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "categories")
public class Categorie extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "designation")
    private String designation;
    @Column(name = "identreprise")
    private Integer idEntreprise;
    @OneToMany(mappedBy = "categorie")
    private List<Article> articles;
}
