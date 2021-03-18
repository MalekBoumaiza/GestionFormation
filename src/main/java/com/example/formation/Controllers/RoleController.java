package com.example.formation.Controllers;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Role;
import com.example.formation.Services.AdminService;
import com.example.formation.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/GestionFormationAPI")
public class RoleController {
    @Autowired
    RoleService roleSRV;

    @GetMapping("/allRole")
    public List<Role> getAllRoles() {
        List<Role> pro = roleSRV.getAllRoles();

        return pro;

    }
    @PostMapping("/addRole")
    public Role createRole(@RequestBody Role role) {
        return roleSRV.addRole(role);
    }

    @GetMapping("/GetRoleById/{id}")
    public Role getRoleById(@PathVariable(value = "id") Long Id) {
        return roleSRV.getRoleById(Id);
    }

    @DeleteMapping("/DeleteRole/{id}")
    public ResponseEntity<?> deleteRole(@PathVariable(value = "id") Long userId) {
        roleSRV.deleteRole(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateRole/{id}")
    public Role updateRole(@PathVariable(value = "id") Long Id,
                           @RequestBody Role RoleDetails) {
        return roleSRV.updateRole(Id, RoleDetails);
    }
}

