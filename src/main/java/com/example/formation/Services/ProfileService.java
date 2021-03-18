package com.example.formation.Services;

import com.example.formation.Entities.Profile;
import com.example.formation.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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
    public Profile addProfile(Profile profile) { return profileRepository.save(profile);}
    @Override
    public void deleteProfile(long id) {profileRepository.deleteById(id);}

    @Override
    public Profile updateProfile( Long Id, Profile ProfileDetails) {

        Profile profile = profileRepository.findById(Id).orElseThrow(null);

        profile.setLibelle(ProfileDetails.getLibelle());
        profile.setPersonnesList(ProfileDetails.getPersonnesList());

        Profile updatedProfile = profileRepository.save(profile);

        return updatedProfile;
    }
}
