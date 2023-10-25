package com.sadev.gestionDeStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sadev.gestionDeStock.model.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VenteDto {
    private Integer id;
    private String code;
    private Instant dateVente;
    private String commentaire;
    private List<LigneVenteDto> ligneVentes;
    private Integer idEntreprise;

    public static VenteDto fromEntity(Vente vente) {
        if (vente == null) {
            return null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .commentaire(vente.getCommentaire())
                .idEntreprise(vente.getIdEntreprise())
                .build();
    }

    public static Vente toEntity(VenteDto dto) {
        if (dto == null) {
            return null;
        }
        Vente vente = new Vente();
        vente.setId(dto.getId());
        vente.setCode(vente.getCode());
        vente.setCommentaire(dto.getCommentaire());
        vente.setIdEntreprise(dto.getIdEntreprise());
        return vente;
    }

}
