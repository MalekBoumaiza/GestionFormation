package com.example.formation.Services;

import com.example.formation.Entities.Formation;

import java.util.List;

public interface InterfFormationService {
    public List<Formation> getAllFormations();
    public Formation getFormationById(long id);
    public Formation addFormation(Formation formation);
    public void deleteFormation(long id);
    public Formation updateFormation(Long id, Formation formation);
}
