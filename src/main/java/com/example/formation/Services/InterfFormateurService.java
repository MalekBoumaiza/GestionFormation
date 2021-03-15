package com.example.formation.Services;
import com.example.formation.Entities.Formateur;

import java.util.List;

public interface InterfFormateurService {
    public List<Formateur> getAllFormateurs();
    public Formateur getFormateurById(long id);
    public void addFormateur(Formateur formateur);
    public void deleteFormateur(long id);
}
