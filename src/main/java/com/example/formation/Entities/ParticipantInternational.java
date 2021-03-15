package com.example.formation.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ParticipantInternational", catalog = "formation")
public class ParticipantInternational implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParticipantI;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private long tel;
    private String mail;
    private String profil;
    private String niveau;


    @ManyToOne
    @JoinColumn(name="roleId", nullable=false)
    private Role role;

    @ManyToOne
    @JoinColumn(name="sessionId", nullable=false)
    private Session session;

    public ParticipantInternational(String login, String password, String nom, String prenom, long tel,
                                    String mail, String profil, String niveau, Role role, Session session) {
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.profil = profil;
        this.niveau = niveau;
        this.role = role;
        this.session = session;
    }

    public ParticipantInternational() {

    }

    public Long getIdParticipantI() {
        return idParticipantI;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
