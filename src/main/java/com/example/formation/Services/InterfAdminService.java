package com.example.formation.Services;

import com.example.formation.Entities.Admin;
import com.example.formation.Models.AdminModel;
import org.springframework.beans.factory.ObjectProvider;

import java.util.List;
import java.util.Objects;

public interface InterfAdminService {
    public List<AdminModel> getAdmins();
    public List<Admin> getAllAdmins();
    public Admin getAdminById(long id);
    public void addAdmin(Admin admin);
    public void deleteAdmin(long id);
}
