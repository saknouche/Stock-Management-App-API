package com.sadev.gestionDeStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sadev.gestionDeStock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresseDto;
    private String photo;
    private String mail;
    private String numTel;
    private Integer idEntreprise;
    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client) {
        if (client == null) {
            return null;
        }

        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresseDto(AdresseDto.fromEntity(client.getAdresse()))
                .idEntreprise(client.getIdEntreprise())
                .build();
    }

    public static Client toEntity(ClientDto clientDtoto) {
        if (clientDtoto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(clientDtoto.getId());
        client.setNom(clientDtoto.getNom());
        client.setPrenom(clientDtoto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(clientDtoto.getAdresseDto()));
        client.setPhoto(clientDtoto.getPhoto());
        client.setMail(clientDtoto.getMail());
        client.setNumTel(clientDtoto.getNumTel());
        client.setIdEntreprise(clientDtoto.getIdEntreprise());
        return client;
    }
}
