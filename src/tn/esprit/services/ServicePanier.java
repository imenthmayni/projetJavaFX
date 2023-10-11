/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.esprit.entities.Offre;
import tn.esprit.entities.Panier;
import tn.esprit.entities.User;
import tn.esprit.tools.DataSource;

/**
 *
 * @author imen
 */
public class ServicePanier implements IsevicePanier<Panier>{
    //private static ServicePanier instance;
    PreparedStatement preparedStatement;
    Connection connection;
    
    public ServicePanier() {
        connection =  DataSource.getInstance().getConnection();

}
@Override
public void ajouter(Panier p,Offre of, User us)  {
    
        try {
            String req = "INSERT INTO panier (idOffre, total, datePanier, iduser) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(req); // Indiquez RETURN_GENERATED_KEYS
            
            // Définissez l'ID manuellement
            ps.setInt(1,of.getIdOffre() );
            ps.setInt(2, p.getTotal());
            ps.setDate(3, new java.sql.Date(p.getDatePanier().getTime()));
            ps.setInt(4,us.getIduser());
            
            ps.executeUpdate();
            System.out.println("panier ajouté !!!!!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    

}

    @Override
    public void modifier(int id, Panier panierModifie,int idf) throws SQLException {
          if (existePanier(id)) {
    } else {
        System.err.println("L'ID spécifié n'existe pas dans la base de données.");
        return; // Sortez de la méthode si l'ID n'existe pas
        }
    
    // Si l'ID existe, effectuez la mise à jour
   String req = "UPDATE panier SET idOffre=?,total=?, datePanier=? WHERE idPanier=?";
    PreparedStatement ps = connection.prepareStatement(req);

    // Spécifiez les valeurs pour les paramètres de la requête préparée
    ps.setInt(2, panierModifie.getTotal());
    ps.setInt(1,idf );
    ps.setDate(3, new java.sql.Date(panierModifie.getDatePanier().getTime()));
    ps.setInt(4, id);
  

    ps.executeUpdate();
    }

    @Override
    public void supprimer(int id) throws SQLException {
  if (!existePanier(id)) {
        System.err.println("L'ID spécifié n'existe pas dans la base de données.");
        return; // Sortez de la méthode si l'ID n'existe pas
    }
    
    // Si l'ID existe, effectuez la suppression
    String req = "DELETE FROM panier WHERE idOffre=?";
    PreparedStatement ps = connection.prepareStatement(req);
    ps.setInt(1, id); 
    
    ps.executeUpdate();    }

    

    @Override
    public boolean existePanier(int id) throws SQLException {
    String req = "SELECT idPanier FROM panier WHERE idPanier=?";
    PreparedStatement ps = connection.prepareStatement(req);
    ps.setInt(1, id);
    
    ResultSet rs = ps.executeQuery();
    
    return rs.next();    }
    

    
    
    
    
    
    
    
    
    @Override
    public List<Panier> recuperer() throws SQLException {
  List<Panier> listePaniers = new ArrayList<>();

    // Écrivez la requête SQL pour récupérer les offres
    String req = "SELECT idPanier, total, datePanier, idOffre, iduser FROM panier";

    PreparedStatement ps = connection.prepareStatement(req);
    ResultSet rs = ps.executeQuery();

    while (rs.next()) {
        
        Panier panier = new Panier();
        panier.setIdPanier(rs.getInt("idPanier"));
        panier.setDatePanier(rs.getDate("datePanier"));
        
       
        User user = new User();
        user.setIduser(rs.getInt("iduser")); // Remplacez le type de données approprié et la méthode d'obtention de l'ID de l'utilisateur
        panier.setUser(user);
        
        Offre offre =new Offre();
        offre.setIdOffre(rs.getInt("idOffre"));
        panier.setOffre(offre);

        // Ajoutez l'offre à la liste
        listePaniers.add(panier);
    }

    return listePaniers;
}
    }




