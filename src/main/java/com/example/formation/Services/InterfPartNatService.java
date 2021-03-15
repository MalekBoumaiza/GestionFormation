package com.example.formation.Services;
import com.example.formation.Entities.ParticipantNational;

import java.util.List;

public interface InterfPartNatService {
    public List<ParticipantNational> getAllPartNat();
    public ParticipantNational getPartNatById(long id);
    public void addPartNat(ParticipantNational PartNat);
    public void deletePartNat(long id);
}
