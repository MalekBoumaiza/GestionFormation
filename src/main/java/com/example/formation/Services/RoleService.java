package com.example.formation.Services;

import com.example.formation.Entities.Admin;
import com.example.formation.Entities.Personne;
import com.example.formation.Entities.Role;
import com.example.formation.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public Role addRole(Role role) {return roleRepository.save(role);}
    @Override
    public void deleteRole(long id) {roleRepository.deleteById(id);}

    @Override
    public Role updateRole(Long Id, Role RoleDetails) {

        Role role = roleRepository.findById(Id).orElseThrow(null);

        role.setLibelle(RoleDetails.getLibelle());
        role.setAdmin(RoleDetails.getAdmin());
        // role.setPersonnes(RoleDetails.getPersonnes());

        Role updatedRole = roleRepository.save(role);

        return updatedRole;
    }
}
