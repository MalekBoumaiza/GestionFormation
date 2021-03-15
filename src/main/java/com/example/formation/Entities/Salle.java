package com.example.formation.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Salle", catalog = "formation")
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSalle;
    private String num;
    private String bloc;

    @OneToMany(mappedBy="salle")
    private Set<Session> sessionList;

    public Salle(String num, String bloc, Set<Session> sessionList) {
        this.num = num;
        this.bloc = bloc;
        this.sessionList = sessionList;
    }

    public Long getIdSalle() {
        return idSalle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public Set<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(Set<Session> sessionList) {
        this.sessionList = sessionList;
    }
}
