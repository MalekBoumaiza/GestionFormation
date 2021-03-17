package com.example.formation.Entities;

import com.example.formation.Models.AdminModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Setter
@NoArgsConstructor
@Entity
@Table(name = "Role", catalog = "formation")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    private String libelle;

    @ManyToOne
    @JoinColumn(name="adminId", nullable=false)
    private Admin admin;

    @ManyToMany
    @JoinTable(name = "Personne_Role",
            joinColumns = @JoinColumn(name = "roleId", referencedColumnName = "idRole"),
            inverseJoinColumns = @JoinColumn(name = "personneId", referencedColumnName = "idPersonne"))
    private Set<Personne> personnes = new HashSet<>();

    public Long getIdRole() {
        return idRole;
    }

    public String getLibelle() {
        return libelle;
    }

    public Set<Personne> getPersonnes() {
        return personnes;
    }


}
