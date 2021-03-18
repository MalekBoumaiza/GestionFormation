package com.example.formation.Entities;

import com.example.formation.Models.ProfileModel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@NoArgsConstructor
@Entity
@Table(name = "Personne", catalog = "formation")
public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonne;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private long tel;
    private String mail;
    private String pays;

    @ManyToMany(mappedBy = "personnes")
    private Set<Role> roles;

    @ManyToMany
    @JoinTable(name = "Personne_SessionFormaton",
            joinColumns = @JoinColumn(name = "personneId", referencedColumnName = "idPersonne"),
            inverseJoinColumns = @JoinColumn(name = "sessionId", referencedColumnName = "idSession"))
    private Set<Session> sessions;

    @ManyToOne
    @JoinColumn(name="profileId", nullable=false)
    private Profile profile;

    public Personne(String login, String password, String nom, String prenom, long tel, String mail,
                    String pays, Set<Role> rolesList, Profile profile, Set<Session> sessionChoisi) {
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.pays = pays;
        this.roles = rolesList;
        this.profile = profile;
        this.sessions = sessionChoisi;
    }

    public Long getIdPersonne() { return idPersonne; }

    public String getLogin() { return login; }

    public String getPassword() { return password; }

    public String getNom() { return nom; }

    public String getPrenom() { return prenom; }

    public long getTel() { return tel; }

    public String getMail() { return mail; }

    public String getPays() { return pays; }



    public Set<Role> getRoles() {
        return roles;
    }
      /* public List<RoleModel> getRoles() {
       List<RoleModel> listR = new ArrayList<>();
       roles.forEach(role -> listR.add(new RoleModel(role.getIdRole(), role.getLibelle())));
       return listR;
   }
*/

    public Set<Session> getSessions() { return sessions; }

    public ProfileModel getProfile() {
        ProfileModel prof = new ProfileModel(profile.getIdProfile(), profile.getLibelle());
        return prof;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    public void setProfile(ProfileModel profile) {
        this.profile.setIdProfile(profile.idProfile);
        this.profile.setLibelle(profile.libelle);
    }

    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Session> sessions;*/

   /* @ManyToMany
    @JoinTable(
            name = "Participant_Session",
            joinColumns = @JoinColumn(name = "idSession"),
            inverseJoinColumns = @JoinColumn(name = "idPersonne"))
    Set<Session> sessionChoisi;
*/

}
