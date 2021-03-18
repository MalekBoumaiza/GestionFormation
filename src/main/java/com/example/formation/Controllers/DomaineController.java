package com.example.formation.Controllers;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Domaine;
import com.example.formation.Services.AdminService;
import com.example.formation.Services.DomaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class DomaineController {
    @Autowired
    DomaineService domaineSRV;

    @GetMapping("/allDomaine")
    public List<Domaine> getAllDomaines() {
        List<Domaine> pro = domaineSRV.getAllDomaines();


        return pro;

    }
    @PostMapping("/addDomaine")
    public Domaine createAdmin(@RequestBody Domaine domaine) {
        return domaineSRV.addDomaine(domaine);
    }

    @GetMapping("/GetDomaineById/{id}")
    public Domaine getDomaineById(@PathVariable(value = "id") Long Id) {
        return domaineSRV.getDomaineById(Id);
    }

    @DeleteMapping("/DeleteDomaine/{id}")
    public ResponseEntity<?> deleteDomaine(@PathVariable(value = "id") Long userId) {
        domaineSRV.deleteDomaine(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateDomaine/{id}")
    public Domaine updateDomaine(@PathVariable(value = "id") Long Id,
                                 @RequestBody Domaine DomaineDetails) {
        return domaineSRV.updateDomaine(Id, DomaineDetails);
    }
}
