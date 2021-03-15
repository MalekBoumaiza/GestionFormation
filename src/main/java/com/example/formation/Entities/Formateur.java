package com.example.formation.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Formateur", catalog = "formation")
public class Formateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormateur;
    private String nom;
    private String prenom;
    private long tel;
    private String mail;
    private String profil;


    @ManyToOne
    @JoinColumn(name="roleId", nullable=false)
    private Role role;

    @OneToMany(mappedBy="formateur")
    private Set<Session> sessionList;

    public Formateur(String nom, String prenom, long tel, String mail, String profil, Role role,
                     Set<Session> sessionList) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.profil = profil;
        this.role = role;
        this.sessionList = sessionList;
    }

    public Formateur() {

    }

    public Long getIdFormateur() {
        return idFormateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(Set<Session> sessionList) {
        this.sessionList = sessionList;
    }
}
