package com.example.formation.Controllers;

import com.example.formation.Entities.Admin;
import com.example.formation.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class AdminController {
    @Autowired
    AdminService adminSRV;

    @GetMapping("/allAdmin")
    public List<Admin> getAllAdmins() {
        List<Admin> pro = adminSRV.getAllAdmins();

        return pro;

    }
    @PostMapping("/addAdmin")
    public Admin createAdmin(@RequestBody Admin admin) {
       return adminSRV.addAdmin(admin);
    }

    @GetMapping("/GetAdminById/{id}")
    public Admin getUserById(@PathVariable(value = "id") Long Id) {
        return adminSRV.getAdminById(Id);
    }

    @DeleteMapping("/DeleteAdmin/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
        adminSRV.deleteAdmin(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateAdmin/{id}")
    public Admin updateAdmin(@PathVariable(value = "id") Long Id,
                             @RequestBody Admin AdminDetails) {
       return adminSRV.updateAdmin(Id, AdminDetails);
    }

  /*  @GetMapping("/allAdmin1")
    public List<AdminModel> allAdmins() {
        return adminSRV.getAdmins();
    }*/
}
