package com.example.formation.Services;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Domaine;

import java.util.List;

public interface InterfDomaineService {
    public List<Domaine> getAllDomaines();
    public Domaine getDomaineById(long id);
    public Domaine addDomaine(Domaine domaine);
    public void deleteDomaine(long id);
    public Domaine updateDomaine(Long id, Domaine domaine);
}
