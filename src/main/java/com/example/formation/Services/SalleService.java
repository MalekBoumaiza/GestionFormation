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
    public Salle addSalle(Salle salle) {return salleRepository.save(salle);}
    @Override
    public void deleteSalle(long id) {salleRepository.deleteById(id);}

    @Override
    public Salle updateSalle( Long Id, Salle SalleDetails) {

        Salle salle = salleRepository.findById(Id).orElseThrow(null);

        salle.setBloc(SalleDetails.getBloc());
        salle.setNum(SalleDetails.getNum());
        Salle updatedSalle = salleRepository.save(salle);

        return updatedSalle;
    }
}
