package com.example.formation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.formation.Entities.Formateur;
import com.example.formation.Repository.FormateurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FormateurService implements InterfFormateurService{
    @Autowired
    FormateurRepository formateurRepository;
    @Override
    public List<Formateur> getAllFormateurs() {
        List<Formateur> liste = (List<Formateur>) formateurRepository.findAll();
        return liste;}
    @Override
    public Formateur getFormateurById(long id) {
        return formateurRepository.findById(id).get();}
    @Override
    public void addFormateur(Formateur formateur) {formateurRepository.save(formateur);}
    @Override
    public void deleteFormateur(long id) {formateurRepository.deleteById(id);}
}
