package com.example.formation.Repository;

import com.example.formation.Entities.ParticipantInternational;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartINTERNATIONALRepository extends JpaRepository<ParticipantInternational,Long> {
}
