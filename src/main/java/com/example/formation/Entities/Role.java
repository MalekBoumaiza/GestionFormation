package com.example.formation.Entities;

import com.example.formation.Models.AdminModel;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;



@NoArgsConstructor
@Entity
@Table(name = "Role", catalog = "formation")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    private String libelle;

    @ManyToOne
    @JoinColumn(name="adminId", nullable=false)
    private Admin admin;

    @ManyToMany
    @JoinTable(name = "Personne_Role",
            joinColumns = @JoinColumn(name = "roleId", referencedColumnName = "idRole"),
            inverseJoinColumns = @JoinColumn(name = "personneId", referencedColumnName = "idPersonne"))
    private Set<Personne> personnes;


    public Long getIdRole() {
        return idRole;
    }

    public String getLibelle() {
        return libelle;
    }

    /*public Set<Personne> getPersonnes() {
        return personnes;
    }
*/
    public AdminModel getAdmin() {
        AdminModel Ad = new AdminModel(admin.getIdAdmin(), admin.getLogin(),
                admin.getPassword(), admin.getEmail(), admin.getTel() );
        return Ad;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setAdmin(AdminModel admin) {
        this.admin.setTel(admin.tel);
        this.admin.setPassword(admin.password);
        this.admin.setEmail(admin.email);
        this.admin.setLogin(admin.login);
        this.admin.setIdAdmin(admin.idAdmin);
    }

    public void setPersonnes(Set<Personne> personnes) {
        this.personnes = personnes;
    }

}
