/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.services;

import java.sql.SQLException;
import java.util.List;
import tn.esprit.entities.Offre;
import tn.esprit.entities.Panier;
import tn.esprit.entities.User;

/**
 *
 * @author imen
 */
public interface IsevicePanier<Panier> {
    void ajouter(Panier p,Offre of, User us)  ;

    public void modifier(int id, Panier panierModifie,int idf) throws SQLException ;

    void supprimer(int id) throws SQLException ;

    List<Panier> recuperer() throws SQLException ;
    public boolean existePanier(int id) throws SQLException;
    
    
}
