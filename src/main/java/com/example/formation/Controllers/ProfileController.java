package com.example.formation.Controllers;

import com.example.formation.Entities.Profile;
import com.example.formation.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class ProfileController {
    @Autowired
    ProfileService profileSRV;

    @GetMapping("/allProfile")
    public List<Profile> getAllProfiles() {
        List<Profile> pro = profileSRV.getAllProfiles();
        return pro;
    }
    @PostMapping("/addProfile")
    public Profile createProfile(@RequestBody Profile profile) {
        return profileSRV.addProfile(profile);
    }

    @GetMapping("/GetProfileById/{id}")
    public Profile getProfileById(@PathVariable(value = "id") Long Id) {
        return profileSRV.getProfileById(Id);
    }

    @DeleteMapping("/DeleteProfile/{id}")
    public ResponseEntity<?> deleteProfile(@PathVariable(value = "id") Long userId) {
        profileSRV.deleteProfile(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateProfile/{id}")
    public Profile updatePersonne(@PathVariable(value = "id") Long Id,
                                  @RequestBody Profile ProfileDetails) {
        return profileSRV.updateProfile(Id, ProfileDetails);
    }
}
