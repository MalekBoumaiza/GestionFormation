package com.example.formation.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Domaine", catalog = "formation")
public class Domaine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDomaine;
    private String libelle;

    @OneToMany(mappedBy="domaine")
    private Set<Formation> formationList;

    public Domaine(String libelle, Set<Formation> formationList) {
        this.libelle = libelle;
        this.formationList = formationList;
    }

    public Domaine() {

    }

    public Long getIdDomaine() {
        return idDomaine;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Set<Formation> getFormationList() {
        return formationList;
    }

    public void setFormationList(Set<Formation> formationList) {
        this.formationList = formationList;
    }
}
