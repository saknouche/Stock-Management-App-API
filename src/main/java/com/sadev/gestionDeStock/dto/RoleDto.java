package com.sadev.gestionDeStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sadev.gestionDeStock.model.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {
    private Integer id;
    private String nomRole;
    @JsonIgnore
    private UtilisateurDto utilisateur;

    public static RoleDto fromEntity(Role roles) {
        if (roles == null) {
            return null;
        }
        return RoleDto.builder()
                .id(roles.getId())
                .nomRole(roles.getNomRole())
                .build();
    }

    public static Role toEntity(RoleDto dto) {
        if (dto == null) {
            return null;
        }
        Role roles = new Role();
        roles.setId(dto.getId());
        roles.setNomRole(dto.getNomRole());
        roles.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));
        return roles;
    }
}
