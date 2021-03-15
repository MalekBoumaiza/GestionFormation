package com.example.formation.Controllers;

import com.example.formation.Entities.Admin;
import com.example.formation.Models.AdminModel;
import com.example.formation.Services.AdminService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class AdminController {
    @Autowired
    AdminService adminSRV;



    @GetMapping("/allAdmin")
    public List<AdminModel> allAdmins() {
        return adminSRV.getAdmins();
    }
}
