package com.example.formation.Repository;

import com.example.formation.Entities.Personne;
import com.example.formation.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
