package com.example.formation.Repository;

import com.example.formation.Entities.Admin;
import com.example.formation.Models.AdminModel;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {


    @Query("select new com.example.formation.Models.AdminModel(a.idAdmin , a.login, a.password, a.role.libelle, a.role.idRole) from Admin a")
    public List<AdminModel> getAdmin();
}
