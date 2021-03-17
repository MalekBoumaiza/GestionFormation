package com.example.formation.Services;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Salle;

import java.util.List;

public interface InterfSalleService {
    public List<Salle> getAllSalles();
    public Salle getSalleById(long id);
    public Salle addSalle(Salle salle);
    public void deleteSalle(long id);
    public Salle updateSalle(Long id, Salle salle);
}
