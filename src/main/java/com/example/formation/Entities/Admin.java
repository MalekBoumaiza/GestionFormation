package com.example.formation.Entities;

import com.example.formation.Models.AdminModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "Admin", catalog = "formation")
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name="roleId", nullable=false)
    private Role role;

    public Long getIdAdmin() {
        return idAdmin;
    }

    public Admin(String login, String password, Role role) {

        this.login = login;
        this.password = password;
        this.role = role;
    }

    public Admin() {

    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
   }

    public void setRole(Role role) {
       this.role = role;
    }
}
