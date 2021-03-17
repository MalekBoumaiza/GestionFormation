package com.example.formation.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Profile", catalog = "formation")

@Getter
@Setter
@NoArgsConstructor
public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfile;
    private String libelle;

    @OneToMany(mappedBy="profile")
    private Set<Personne> personnesList;

    public Profile(String libelle, Set<Personne> personnesList) {
        this.libelle = libelle;
        this.personnesList = personnesList;
    }
}
