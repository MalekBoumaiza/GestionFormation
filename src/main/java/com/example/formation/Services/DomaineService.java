package com.example.formation.Services;


import com.example.formation.Entities.Domaine;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.formation.Repository.DomaineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DomaineService implements InterfDomaineService{
    @Autowired
    DomaineRepository domaineRepository;
    @Override
    public List<Domaine> getAllDomaines() {
        List<Domaine> liste = (List<Domaine>) domaineRepository.findAll();
        return liste;}
    @Override
    public Domaine getDomaineById(long id) {
        return domaineRepository.findById(id).get();}
    @Override
    public Domaine addDomaine(Domaine admin) {return domaineRepository.save(admin);}
    @Override
    public void deleteDomaine(long id) {domaineRepository.deleteById(id);}


    @Override
    public Domaine updateDomaine( Long Id, Domaine DomaineDetails) {

        Domaine domaine = domaineRepository.findById(Id).orElseThrow(null);

        domaine.setLibelle(DomaineDetails.getLibelle());
        domaine.setFormationList(DomaineDetails.getFormationList());

        Domaine updatedDomaine = domaineRepository.save(domaine);

        return updatedDomaine;
    }

}
