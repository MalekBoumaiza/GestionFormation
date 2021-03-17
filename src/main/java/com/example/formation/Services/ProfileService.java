package com.example.formation.Services;

import com.example.formation.Entities.Profile;
import com.example.formation.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProfileService implements InterfProfile{
    @Autowired
    ProfileRepository profileRepository;
    @Override
    public List<Profile> getAllProfiles() {
        List<Profile> liste = (List<Profile>) profileRepository.findAll();
        return liste;}
    @Override
    public Profile getProfileById(long id) {
        return profileRepository.findById(id).get();}
    @Override
    public void addProfile(Profile profile) {profileRepository.save(profile);}
    @Override
    public void deleteProfile(long id) {profileRepository.deleteById(id);}
}
