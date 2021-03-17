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

}
