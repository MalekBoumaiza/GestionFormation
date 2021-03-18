package com.example.formation.Entities;

import com.example.formation.Models.DomaineModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
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

    public int getNbSession() {
        return NbSession;
    }

    public String getDuree() {
        return duree;
    }

    public long getTarif() {
        return tarif;
    }

    public DomaineModel getDomaine() {
        DomaineModel dom = new DomaineModel(domaine.getIdDomaine(), domaine.getLibelle());
        return dom;
    }

    public Set<Session> getSessionList() {
        return sessionList;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbSession(int nbSession) {
        NbSession = nbSession;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setTarif(long tarif) {
        this.tarif = tarif;
    }

    public void setDomaine(DomaineModel domaine) {
        this.domaine.setIdDomaine(domaine.idDomaine);
        this.domaine.setLibelle(domaine.libelle);
    }

    public void setSessionList(Set<Session> sessionList) {
        this.sessionList = sessionList;
    }
}
