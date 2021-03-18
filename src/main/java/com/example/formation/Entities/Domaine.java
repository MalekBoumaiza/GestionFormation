package com.example.formation.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
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
}
