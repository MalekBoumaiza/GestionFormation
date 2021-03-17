package com.example.formation.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Personne", catalog = "formation")
public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonne;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private long tel;
    private String mail;
    private String pays;

   /* @ManyToMany(mappedBy = "personnesList")
    private Set<Role> rolesList;*/

    @ManyToMany(mappedBy = "personnes")
    private Set<Role> roles;

    @ManyToMany
    @JoinTable(name = "Personne_SessionFormaton",
            joinColumns = @JoinColumn(name = "personneId", referencedColumnName = "idPersonne"),
            inverseJoinColumns = @JoinColumn(name = "sessionId", referencedColumnName = "idSession"))
    private Set<Session> sessions;

    @ManyToOne
    @JoinColumn(name="profileId", nullable=false)
    private Profile profile;

/*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Session> sessions;*/

   /* @ManyToMany
    @JoinTable(
            name = "Participant_Session",
            joinColumns = @JoinColumn(name = "idSession"),
            inverseJoinColumns = @JoinColumn(name = "idPersonne"))
    Set<Session> sessionChoisi;
*/
    public Personne(String login, String password, String nom, String prenom, long tel, String mail,
                    String pays, Set<Role> rolesList, Profile profile, Set<Session> sessionChoisi) {
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.pays = pays;
        this.roles = rolesList;
        this.profile = profile;
        this.sessions = sessionChoisi;
    }
}
