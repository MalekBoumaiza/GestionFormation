package com.example.formation.Services;

import com.example.formation.Entities.Domaine;

import java.util.List;

public interface InterfDomaineService {
    public List<Domaine> getAllDomaines();
    public Domaine getDomaineById(long id);
    public void addDomaine(Domaine domaine);
    public void deleteDomaine(long id);
}
