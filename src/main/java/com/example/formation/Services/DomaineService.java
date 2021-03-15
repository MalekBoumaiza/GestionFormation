package com.example.formation.Services;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.formation.Entities.Domaine;
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
    public void addDomaine(Domaine admin) {domaineRepository.save(admin);}
    @Override
    public void deleteDomaine(long id) {domaineRepository.deleteById(id);}
}
