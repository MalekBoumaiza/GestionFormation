package com.example.formation.Repository;

import com.example.formation.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

 /*@Query("select new com.example.formation.Models.AdminModel(a.idAdmin , a.login, a.password) from Admin a")
    public List<AdminModel> getAdmin();*/
}
