package com.example.formation.Services;


import com.example.formation.Entities.ParticipantInternational;
import com.example.formation.Repository.PartINTERNATIONALRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PartInterService implements InterfPartInterService{
    @Autowired
    PartINTERNATIONALRepository PartInterRepository;
    @Override
    public List<ParticipantInternational> getAllPartInter() {
        List<ParticipantInternational> liste = (List<ParticipantInternational>) PartInterRepository.findAll();
        return liste;}
    @Override
    public ParticipantInternational getPartInterById(long id) {
        return PartInterRepository.findById(id).get();}
    @Override
    public void addPartInter(ParticipantInternational PartInter) {PartInterRepository.save(PartInter);}
    @Override
    public void deletePartInter(long id) {PartInterRepository.deleteById(id);}
}
