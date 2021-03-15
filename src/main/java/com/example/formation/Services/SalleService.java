package com.example.formation.Services;

import com.example.formation.Entities.Salle;
import com.example.formation.Repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SalleService implements InterfSalleService{
    @Autowired
    SalleRepository salleRepository;
    @Override
    public List<Salle> getAllSalles() {
        List<Salle> liste = (List<Salle>) salleRepository.findAll();
        return liste;}
    @Override
    public Salle getSalleById(long id) {
        return salleRepository.findById(id).get();}
    @Override
    public void addSalle(Salle salle) {salleRepository.save(salle);}
    @Override
    public void deleteSalle(long id) {salleRepository.deleteById(id);}
}
