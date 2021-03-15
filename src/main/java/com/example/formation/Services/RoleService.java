package com.example.formation.Services;

import com.example.formation.Entities.Role;
import com.example.formation.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService implements InterfRoleService{
    @Autowired
    RoleRepository roleRepository;
    @Override
    public List<Role> getAllRoles() {
        List<Role> liste = (List<Role>) roleRepository.findAll();
        return liste;}
    @Override
    public Role getRoleById(long id) {
        return roleRepository.findById(id).get();}
    @Override
    public void addRole(Role role) {roleRepository.save(role);}
    @Override
    public void deleteRole(long id) {roleRepository.deleteById(id);}
}
