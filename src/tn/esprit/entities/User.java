/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.entities;

/**
 *
 * @author imen
 */
public class User {
    private int iduser;
    private String nom;
     private  Panier panier ;
     private Offre offre;
    

    public User(int iduser,  String nom ,int idPanier) {
        this.iduser = iduser;
        this.nom = nom;
    
    }

    public User() {
       }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
