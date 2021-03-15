package com.example.formation.Services;
import com.example.formation.Entities.Admin;
import com.example.formation.Models.AdminModel;
import com.example.formation.Repository.AdminRepository;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class AdminService implements InterfAdminService{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public List<Admin> getAllAdmins() {
        List<Admin> liste = (List<Admin>) adminRepository.findAll();
        return liste;}

    @Override
    public List<AdminModel> getAdmins() {
        List<AdminModel> liste = (List<AdminModel>) adminRepository.getAdmin();
        return liste;}


    @Override
    public Admin getAdminById(long id) {
        return adminRepository.findById(id).get();}
    @Override
    public void addAdmin(Admin admin) {adminRepository.save(admin);}
    @Override
    public void deleteAdmin(long id) {adminRepository.deleteById(id);}
}




