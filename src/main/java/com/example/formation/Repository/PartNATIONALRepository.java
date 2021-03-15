package com.example.formation.Repository;

import com.example.formation.Entities.ParticipantNational;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartNATIONALRepository extends JpaRepository<ParticipantNational,Long> {
}
