package com.example.formation.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Setter
@NoArgsConstructor
@Entity
@Table(name = "Session", catalog = "formation")
public class Session implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;
    private Date dateDebut;
    private Date dateFin;
    private String formateur;
    private Long nombreParticpant;


    @ManyToMany(mappedBy = "sessions")
    private Set<Personne> participantsList;

    @ManyToOne
    @JoinColumn(name="formationId", nullable=false)
    private Formation formation;

    public Long getIdSession() {
        return idSession;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getFormateur() {
        return formateur;
    }

    public Long getNombreParticpant() {
        return nombreParticpant;
    }

    public Set<Personne> getParticipantsList() {
        return participantsList;
    }

    public long getSalle() {
        return salle.getIdSalle();
    }

    public long getFormation() {
        return formation.getIdFormation();
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    @ManyToOne
    @JoinColumn(name="salleId", nullable=false)
    private Salle salle;

    public Session(Date dateDebut, Date dateFin, String formateur, Long nombreParticpant,
                   Set<Personne> participantsList, Formation formation, Salle salle) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.formateur = formateur;
        this.nombreParticpant = nombreParticpant;
        this.participantsList = participantsList;
        this.formation = formation;
        this.salle = salle;
    }


/*
    @OneToMany(mappedBy="session")
    private Set<ParticipantNational> participantNatList;

    @OneToMany(mappedBy="session")
    private Set<ParticipantInternational> participantInternList;
*/

}
