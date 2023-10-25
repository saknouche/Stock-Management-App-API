package com.sadev.gestionDeStock.validator;

import com.sadev.gestionDeStock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();

        if (utilisateurDto == null) {
            errors.add("Veuillez renseigner le nom de l'utilisateur.");
            errors.add("Veuillez renseigner le prénom de l'utilisateur.");
            errors.add("Veuillez renseigner l'eamil de l'utilisateur.");
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur.");
            errors.add("Veuillez rensigner l'adresse de l'utilisateur.");
            errors.addAll(AdresseValidator.validate(null));
            return errors;
        }

        if (!StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("Veuillez renseigner le nom de l'utilisateur.");
        }
        if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
            errors.add("Veuillez renseigner le prénom de l'utilisateur.");
        }
        if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
            errors.add("Veuillez renseigner l'eamil de l'utilisateur.");
        }
        if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur.");
        }
        if (utilisateurDto.getDateDeNaissance() == null) {
            errors.add("Veuillez renseigner la date de naissance de l'utilisateur.");
        }
        errors.addAll(AdresseValidator.validate(utilisateurDto.getAdresseDto()));
        return errors;
    }
}
