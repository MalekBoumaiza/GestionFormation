package com.example.formation.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Formation", catalog = "formation")
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;
    private String titre;
    private int NbSession;
    private String duree;
    private long tarif;

    @ManyToOne
    @JoinColumn(name="domaineId", nullable=false)
    private Domaine domaine;

    @OneToMany(mappedBy="formation")
    private Set<Session> sessionList;

    public Formation(String titre, int nbSession, String duree,
                     long tarif, Domaine domaine, Set<Session> sessionList) {
        this.titre = titre;
        NbSession = nbSession;
        this.duree = duree;
        this.tarif = tarif;
        this.domaine = domaine;
        this.sessionList = sessionList;
    }

    public Long getIdFormation() {
        return idFormation;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbSession() {
        return NbSession;
    }

    public void setNbSession(int nbSession) {
        NbSession = nbSession;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public long getTarif() {
        return tarif;
    }

    public void setTarif(long tarif) {
        this.tarif = tarif;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Set<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(Set<Session> sessionList) {
        this.sessionList = sessionList;
    }
}
