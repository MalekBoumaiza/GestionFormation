package com.example.formation.Services;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.formation.Entities.Formation;
import com.example.formation.Repository.FormationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FormationService implements InterfFormationService{
    @Autowired
    FormationRepository formationRepository;
    @Override
    public List<Formation> getAllFormations() {
        List<Formation> liste = (List<Formation>) formationRepository.findAll();
        return liste;}
    @Override
    public Formation getFormationById(long id) {
        return formationRepository.findById(id).get();}
    @Override
    public void addFormation(Formation formation) {formationRepository.save(formation);}
    @Override
    public void deleteFormation(long id) {formationRepository.deleteById(id);}
}
