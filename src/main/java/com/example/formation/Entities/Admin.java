package com.example.formation.Entities;

import com.example.formation.Models.AdminModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Admin", catalog = "formation")
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;
    private String login;
    private String password;
    private String email;
    private Long tel;

    @OneToMany(mappedBy="admin")
    private Set<Role> roles;

    public Admin(String login, String password, String email, Long tel, Set<Role> roleList) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.roles = roleList;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public void setRoles(Set<Role> roles) {
        this.roles= roles;
    }

    public void setIdAdmin(Long idAdmin) { this.idAdmin = idAdmin; }
}
