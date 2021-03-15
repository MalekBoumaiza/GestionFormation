package com.example.formation.Models;


import java.io.Serializable;

public class AdminModel implements Serializable {
     public  Long idAdmin ;
     public String login;
     public String password;
     public String libelle;
     public Long idRole;

     public AdminModel() {
     }

     public AdminModel(Long idAdmin, String login, String password, String libelle, Long idRole) {
          this.idAdmin = idAdmin;
          this.login = login;
          this.password = password;
          this.libelle = libelle;
          this.idRole = idRole;
     }
}
/*public interface AdminModel{
     Long getIdAdmin() ;
     String getLogin();
     String getPassword();
     String getLibelle();
     Long getIdRole();
}
*/