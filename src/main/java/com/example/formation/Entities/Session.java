package com.example.formation.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Session", catalog = "formation")
public class Session implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDomaine;
    private Date dateDebut;
    private Date dateFin;

    @ManyToOne
    @JoinColumn(name="formationId", nullable=false)
    private Formation formation;

    @ManyToOne
    @JoinColumn(name="salleId", nullable=false)
    private Salle salle;

    @ManyToOne
    @JoinColumn(name="formateurId", nullable=false)
    private Formateur formateur;

    @OneToMany(mappedBy="session")
    private Set<ParticipantNational> participantNatList;

    @OneToMany(mappedBy="session")
    private Set<ParticipantInternational> participantInternList;

    public Session(Date dateDebut, Date dateFin, Formation formation, Salle salle,
                   Formateur formateur, Set<ParticipantNational> participantNatList,
                   Set<ParticipantInternational> participantInternList) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.formation = formation;
        this.salle = salle;
        this.formateur = formateur;
        this.participantNatList = participantNatList;
        this.participantInternList = participantInternList;
    }

    public Session() {

    }

    public Long getIdDomaine() {
        return idDomaine;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Set<ParticipantNational> getParticipantNatList() {
        return participantNatList;
    }

    public void setParticipantNatList(Set<ParticipantNational> participantNatList) {
        this.participantNatList = participantNatList;
    }

    public Set<ParticipantInternational> getParticipantInternList() {
        return participantInternList;
    }

    public void setParticipantInternList(Set<ParticipantInternational> participantInternList) {
        this.participantInternList = participantInternList;
    }
}
