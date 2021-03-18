package com.example.formation.Services;


import com.example.formation.Entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Formation addFormation(Formation formation) {return formationRepository.save(formation);}
    @Override
    public void deleteFormation(long id) {formationRepository.deleteById(id);}

    @Override
    public Formation updateFormation( Long Id, Formation FormationDetails) {
        Formation formation = formationRepository.findById(Id).orElseThrow(null);

        formation.setDomaine(FormationDetails.getDomaine());
        formation.setDuree(FormationDetails.getDuree());
        formation.setTarif(FormationDetails.getTarif());
        formation.setNbSession(FormationDetails.getNbSession());
        formation.setTitre(FormationDetails.getTitre());
        formation.setSessionList(FormationDetails.getSessionList());

        Formation updatedFormation = formationRepository.save(formation);

        return updatedFormation;
    }
}
