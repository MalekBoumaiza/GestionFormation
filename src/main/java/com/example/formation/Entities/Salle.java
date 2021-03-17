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
}
