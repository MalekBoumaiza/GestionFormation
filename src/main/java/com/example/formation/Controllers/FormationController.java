package com.example.formation.Controllers;

import com.example.formation.Entities.Formation;
import com.example.formation.Services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class FormationController {
    @Autowired
    FormationService formationSRV;

    @GetMapping("/allFormation")
    public List<Formation> getAllDomaines() {
        List< Formation> pro = formationSRV.getAllFormations();
        return pro;
    }
    @PostMapping("/addFormation")
    public Formation createAdmin(@RequestBody Formation domaine) {
        return formationSRV.addFormation(domaine);
    }

    @GetMapping("/GetFormationById/{id}")
    public Formation getFormationById(@PathVariable(value = "id") Long Id) {
        return formationSRV.getFormationById(Id);
    }

    @DeleteMapping("/DeleteFormation/{id}")
    public ResponseEntity<?> deleteFormation(@PathVariable(value = "id") Long userId) {
        formationSRV.deleteFormation(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateFormation/{id}")
    public Formation updateFormation(@PathVariable(value = "id") Long Id,
                                     @RequestBody Formation FormationDetails) {
        return formationSRV.updateFormation(Id, FormationDetails);
    }
}
