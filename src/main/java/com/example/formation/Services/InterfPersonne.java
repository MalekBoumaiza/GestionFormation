package com.example.formation.Services;

import com.example.formation.Entities.Personne;

import java.util.List;

public interface InterfPersonne {
    public List<Personne> getAllPersonnes();
    public Personne getPersonneById(long id);
    public Personne addPersonne(Personne personne);
    public void deletePersonne(long id);
    public Personne updatePersonne(Long id, Personne personne);
}
