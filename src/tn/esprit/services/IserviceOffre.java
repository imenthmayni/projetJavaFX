/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.services;

import java.sql.SQLException;
import java.util.List;
import tn.esprit.entities.Offre;
import tn.esprit.entities.User;

/**
 *
 * @author imen
 */
public interface IserviceOffre {
     void ajouter(Offre of, User us) throws SQLException ;

    public void modifier(int id, Offre offreModifie) throws SQLException ;

    void supprimer(int id) throws SQLException ;

    List<Offre> recuperer() throws SQLException ;
    public boolean existeOffre(int id) throws SQLException;
    
}
