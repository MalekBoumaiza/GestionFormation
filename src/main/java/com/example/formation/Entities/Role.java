package com.example.formation.Entities;

import com.example.formation.Models.AdminModel;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Role", catalog = "formation")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    private String libelle;

    @OneToMany(mappedBy="role")
    private Set<Admin> adminList;


    @OneToMany(mappedBy="role")
    private Set<Formateur> formateurList;

    @OneToMany(mappedBy="role")
    private Set<ParticipantInternational> participantIList;

    @OneToMany(mappedBy="role")
    private Set<ParticipantNational> participantNList;

    public Role(String libelle, Set<Admin> adminList, Set<Formateur> formateurList,
                Set<ParticipantInternational> participantIList, Set<ParticipantNational> participantNList) {
        this.libelle = libelle;
        this.adminList = adminList;
        this.formateurList = formateurList;
        this.participantIList = participantIList;
        this.participantNList = participantNList;
    }

    public Role() {

    }

    public Long getIdRole() {
        return idRole;
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Set<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(Set<Admin> adminList) {
        this.adminList = adminList;
    }

    public Set<Formateur> getFormateurList() {
        return formateurList;
    }

    public void setFormateurList(Set<Formateur> formateurList) {
        this.formateurList = formateurList;
    }

    public Set<ParticipantInternational> getParticipantIList() {
        return participantIList;
    }

    public void setParticipantIList(Set<ParticipantInternational> participantIList) {
        this.participantIList = participantIList;
    }

    public Set<ParticipantNational> getParticipantNList() {
        return participantNList;
    }

    public void setParticipantNList(Set<ParticipantNational> participantNList) {
        this.participantNList = participantNList;
    }
}
