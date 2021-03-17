package com.example.formation.Services;

import com.example.formation.Entities.Personne;
import com.example.formation.Repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PersonneService implements InterfPersonne{
    @Autowired
    PersonneRepository personneRepository;
    @Override
    public List<Personne> getAllPersonnes() {
        List<Personne> liste = (List<Personne>) personneRepository.findAll();
        return liste;}
    @Override
    public Personne getPersonneById(long id) {
        return personneRepository.findById(id).get();}
    @Override
    public void addPersonne(Personne personne) {personneRepository.save(personne);}
    @Override
    public void deletePersonne(long id) {personneRepository.deleteById(id);}
}
