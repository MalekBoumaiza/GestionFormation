package com.example.formation.Services;

import com.example.formation.Entities.ParticipantNational;
import com.example.formation.Repository.PartNATIONALRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PartNatService implements InterfPartNatService{
    @Autowired
    PartNATIONALRepository PartNatRepository;
    @Override
    public List<ParticipantNational> getAllPartNat() {
        List<ParticipantNational> liste = (List<ParticipantNational>) PartNatRepository.findAll();
        return liste;}
    @Override
    public ParticipantNational getPartNatById(long id) {
        return PartNatRepository.findById(id).get();}
    @Override
    public void addPartNat(ParticipantNational PartNat) {PartNatRepository.save(PartNat);}
    @Override
    public void deletePartNat(long id) {PartNatRepository.deleteById(id);}
}
