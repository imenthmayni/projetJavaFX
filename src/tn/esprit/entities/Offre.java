/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.entities;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author imen
 */
public class Offre {
    private int idOffre;
    private String nomOffre;
    private  String description;
    private  Date dateDebut;
    private  Date dateFin;
    private  TypeOffre typeOffre;
    private  int valeurOffre;
    private  String imageOffre;
    private Status status;
    private User user;
    

    public Offre(int idOffre, String nomOffre, String description, Date dateDebut, Date dateFin, TypeOffre typeOffre, int valeurOffre, String imageOffre, Status status) {
        this.idOffre = idOffre;
        this.nomOffre = nomOffre;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeOffre = typeOffre;
        this.valeurOffre = valeurOffre;
        this.imageOffre = imageOffre;
        this.status = status;
    }

    public Offre() {
       }

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public String getNomOffre() {
        return nomOffre;
    }

    public void setNomOffre(String nomOffre) {
        this.nomOffre = nomOffre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public TypeOffre getTypeOffre() {
        return typeOffre;
    }

    public void setTypeOffre(TypeOffre typeOffre) {
        this.typeOffre = typeOffre;
    }

    public int getValeurOffre() {
        return valeurOffre;
    }

    public void setValeurOffre(int valeurOffre) {
        this.valeurOffre = valeurOffre;
    }


    public String getImageOffre() {
        return imageOffre;
    }

    public void setImageOffre(String imageOffre) {
        this.imageOffre = imageOffre;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
    
    

    
}

    // ... (implémentez les getters et les setters pour les autres propriétés)




