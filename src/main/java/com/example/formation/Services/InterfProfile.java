package com.example.formation.Services;

import com.example.formation.Entities.Profile;

import java.util.List;

public interface InterfProfile {
    public List<Profile> getAllProfiles();
    public Profile getProfileById(long id);
    public void addProfile(Profile profile);
    public void deleteProfile(long id);
}
