package com.example.formation.Controllers;

import com.example.formation.Entities.Domaine;
import com.example.formation.Entities.Personne;
import com.example.formation.Services.DomaineService;
import com.example.formation.Services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class PersonneController {
    @Autowired
    PersonneService personneSRV;

    @GetMapping("/allPersonne")
    public List<Personne> getAllPersonnes() {
        List<Personne> pro = personneSRV.getAllPersonnes();

        return pro;

    }
    @PostMapping("/addPersonne")
    public Personne createPersonne(@RequestBody Personne personne) {
        return personneSRV.addPersonne(personne);
    }

    @GetMapping("/GetPersonneById/{id}")
    public Personne getPersonneById(@PathVariable(value = "id") Long Id) {
        return personneSRV.getPersonneById(Id);
    }

    @DeleteMapping("/DeletePersonne/{id}")
    public ResponseEntity<?> deletePersonne(@PathVariable(value = "id") Long userId) {
        personneSRV.deletePersonne(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updatePersonne/{id}")
    public Personne updatePersonne(@PathVariable(value = "id") Long Id,
                                   @RequestBody Personne PersonneDetails) {
        return personneSRV.updatePersonne(Id, PersonneDetails);
    }
}
