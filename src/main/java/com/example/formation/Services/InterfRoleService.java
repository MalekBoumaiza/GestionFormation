package com.example.formation.Services;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Role;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InterfRoleService {
    public List<Role> getAllRoles();
    public Role getRoleById(long id);
    public Role addRole(Role role);
    public void deleteRole(long id);
    public Role updateRole(Long id, Role role);
}
