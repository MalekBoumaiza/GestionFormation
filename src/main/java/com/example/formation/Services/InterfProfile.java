package com.example.formation.Services;

import com.example.formation.Entities.Personne;
import com.example.formation.Entities.Profile;

import java.util.List;

public interface InterfProfile {
    public List<Profile> getAllProfiles();
    public Profile getProfileById(long id);
    public Profile addProfile(Profile profile);
    public void deleteProfile(long id);
    public Profile updateProfile(Long id, Profile profile);
}
