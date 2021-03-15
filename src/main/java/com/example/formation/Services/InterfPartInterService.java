package com.example.formation.Services;

import com.example.formation.Entities.ParticipantInternational;

import java.util.List;

public interface InterfPartInterService {
    public List<ParticipantInternational> getAllPartInter();
    public ParticipantInternational getPartInterById(long id);
    public void addPartInter(ParticipantInternational PartInter);
    public void deletePartInter(long id);
}
