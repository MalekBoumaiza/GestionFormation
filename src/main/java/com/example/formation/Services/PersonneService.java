package com.example.formation.Services;


import com.example.formation.Entities.*;
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
    public Personne addPersonne(Personne personne) {return personneRepository.save(personne);}
    @Override
    public void deletePersonne(long id) {personneRepository.deleteById(id);}

    @Override
    public Personne updatePersonne( Long Id, Personne PersonneDetails) {

        Personne personne = personneRepository.findById(Id).orElseThrow(null);

        personne.setLogin(PersonneDetails.getLogin());
        personne.setPassword(PersonneDetails.getPassword());
        personne.setNom(PersonneDetails.getNom());
        personne.setPrenom(PersonneDetails.getPrenom());
        personne.setTel(PersonneDetails.getTel());
        personne.setMail(PersonneDetails.getMail());
        personne.setPays(PersonneDetails.getPays());
        // personne.setRoles(PersonneDetails.getRoles());
        personne.setSessions(PersonneDetails.getSessions());
        personne.setProfile(PersonneDetails.getProfile());

        Personne updatedPersonne = personneRepository.save(personne);

        return updatedPersonne;
    }
}
