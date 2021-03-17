package com.example.formation.Services;
import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Role;
import com.example.formation.Models.AdminModel;
import com.example.formation.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

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
    public Admin getAdminById(long id) {
        return adminRepository.findById(id).get();
        //orElseThrow(null);
    }
    @Override
    public Admin addAdmin(Admin admin) {return adminRepository.save(admin);}

    @Override
    public void deleteAdmin(long id) {adminRepository.deleteById(id);}

   @Override
    public Admin updateAdmin( Long Id, Admin AdminDetails) {

        Admin admin = adminRepository.findById(Id).orElseThrow(null);


        admin.setEmail(AdminDetails.getEmail());
        admin.setLogin(AdminDetails.getLogin());
        admin.setPassword(AdminDetails.getPassword());
        admin.setEmail(AdminDetails.getEmail());
        admin.setTel(AdminDetails.getTel());
        admin.setRoles(AdminDetails.getRoles());
        Admin updatedAdmin = adminRepository.save(admin);

        return updatedAdmin;
    }
  /*  @Override
    public List<AdminModel> getAdmins() {
        List<AdminModel> liste = (List<AdminModel>) adminRepository.getAdmin();
        return liste;}*/


}




