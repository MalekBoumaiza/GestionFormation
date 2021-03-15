package com.example.formation.Services;

import com.example.formation.Entities.Salle;

import java.util.List;

public interface InterfSalleService {
    public List<Salle> getAllSalles();
    public Salle getSalleById(long id);
    public void addSalle(Salle salle);
    public void deleteSalle(long id);
}
