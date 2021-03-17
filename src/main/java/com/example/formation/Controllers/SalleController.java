package com.example.formation.Controllers;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Salle;
import com.example.formation.Services.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class SalleController {
    @Autowired
    SalleService salleService;

    @GetMapping("/allSalle")
    public List<Salle> getAllSalles() {
        List<Salle> sal = salleService.getAllSalles();
        return sal;
    }


    @GetMapping("/GetSalleById/{id}")
    public Salle getSalleById(@PathVariable(value = "id") Long Id) {
        return salleService.getSalleById(Id);
    }

    @PostMapping("/addSalle")
    public Salle createSalle(@RequestBody Salle salle) {
        return salleService.addSalle(salle);
    }

    @PutMapping("/updateSalle/{id}")
    public Salle updateSalle(@PathVariable(value = "id") Long Id,
                             @RequestBody Salle salleDetails) {
        return salleService.updateSalle(Id, salleDetails);
    }


    @DeleteMapping("/DeleteSalle/{id}")
    public ResponseEntity<?> deleteSalle(@PathVariable(value = "id") Long salleId) {
        salleService.deleteSalle(salleId);
        return ResponseEntity.ok().build();
    }
}
