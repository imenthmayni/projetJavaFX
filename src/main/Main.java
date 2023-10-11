/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import tn.esprit.entities.Offre;
import tn.esprit.entities.Panier;
import static tn.esprit.entities.Panier.calculerTotalPanier;
import tn.esprit.entities.Status;
import tn.esprit.entities.TypeOffre;
import tn.esprit.entities.User;
import tn.esprit.services.ServiceOffre;
import tn.esprit.services.ServicePanier;
import tn.esprit.tools.DataSource;

/**
 *
 * @author imen
 */
public class Main {

public static void main(String[] args) throws SQLException {
   
        
        
        
        
        
        
        
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Ajouter Offre>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
//            Offre nouvelOffre = new Offre();
//            User user = new User();
//            Date dateDebut = new Date(); 
//             Date dateFin = new Date();
//            nouvelOffre.setDateDebut(dateDebut); 
//            nouvelOffre.setDateFin(dateFin); 
//            nouvelOffre.setNomOffre("rrrrrr " ); 
//            nouvelOffre.setTypeOffre(TypeOffre.Package);
//            nouvelOffre.setStatus(Status.Activé);
//            nouvelOffre.setDescription("rrrrrr " ); 
//            nouvelOffre.setImageOffre("imen imen "); 
//            
//            user.setIduser(1);
//            try {
//                // Appelez la méthode d'ajout dans votre service
//                serviceOffre.ajouter(nouvelOffre,user);
//                System.out.println("Offre ajouté avec succès ! L'ID généré est : " + nouvelOffre.getIdOffre());
//            } catch (SQLException e) {
//                System.err.println("Erreur lors de l'ajout de l'Offre : " + e.getMessage());
//            }
//
//



//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Modidifier Offre>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//
//       try {
//            
//            Offre offreModifie = new Offre();
//            Date dateDebut = new Date(); 
//             Date dateFin = new Date();
//            offreModifie.setDateDebut(dateDebut); 
//            offreModifie.setDateFin(dateFin); 
//            offreModifie.setNomOffre("imen " ); 
//            offreModifie.setTypeOffre(TypeOffre.Package);
//            offreModifie.setStatus(Status.Activé);
//            offreModifie.setDescription("imino " ); 
//            offreModifie.setImageOffre("kkkkkkk"); 
//            
//            int idOffreAModifier =17;
//            // Appelez la méthode modifier avec les paramètres appropriés
//            serviceOffre.modifier(idOffreAModifier, offreModifie);
//
//            System.out.println("Mise à jour de l'offre réussie !");
//        } catch (SQLException e) {
//            System.err.println("Erreur lors de la mise à jour de l'offre : " + e.getMessage());
//        }
//    


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Supprimer Offre>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//int iOffreASupprimer = 21; // Remplacez par l'ID de l'Offre  que vous souhaitez supprimer
//    
//    try {
//        
//        serviceOffre.supprimer(idOffreASupprimer);
//        System.out.println("Offre supprimé avec succès !");
//    } catch (SQLException e) {
//        System.err.println("Erreur lors de la suppression de l'offre : " + e.getMessage());
//    }


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Afficher Offre>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//try {
//    
//    List<Offre> listeOffres = serviceOffre.recuperer();
//
//    
//    for (Offre offre : listeOffres) {
//        System.out.println("ID de l'Offre: " + offre.getIdOffre());
//        System.out.println("Nom de l'Offre: " + offre.getNomOffre());
//        System.out.println("Description de l'Offre: " + offre.getDescription());
//        System.out.println("Date de début de l'Offre: " + offre.getDateDebut());
//        System.out.println("Date de fin de l'Offre: " + offre.getDateFin());
//        System.out.println("Type d'Offre: " + offre.getTypeOffre());
//        System.out.println("Valeur de l'Offre: " + offre.getValeurOffre());
//        System.out.println("Image de l'Offre: " + offre.getImageOffre());
//        System.out.println("Statut de l'Offre: " + offre.getStatus());
//
//   
//        if (offre.getUser() != null) {
//            System.out.println("ID de l'Utilisateur associé: " + offre.getUser().getIduser());
//            System.out.println("Nom de l'Utilisateur associé: " + offre.getUser().getNom());
//        } else {
//            System.out.println("Aucun utilisateur associé à cette offre.");
//        }
//
//        System.out.println("-----------------------------------");
//    }
//} catch (SQLException e) {
//    System.err.println("Erreur lors de la récupération des offres : " + e.getMessage());
//}
//
///////<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<ajouterPanier>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><



            Panier nouvelPanier = new Panier();
            User user = new User();
            user.setIduser(1);
            Offre offre = new Offre();
            offre.setIdOffre(7);
            Date datePanier = new Date(); 
             nouvelPanier.setTotal(525);
            nouvelPanier.setDatePanier(datePanier); 
             
          
        
          

            
            ServicePanier sp = new ServicePanier();
            sp.ajouter(nouvelPanier, offre, user);
            
//            try {
//                
//                ServicePanier.getInstance().ajouter(nouvelPanier, offre, user);
//                System.out.println("Panier ajouté avec succès ! L'ID généré est : " + nouvelPanier.getIdPanier());
//            } catch (SQLException e) {
//                System.err.println("Erreur lors de l'ajout de l'Panier : " + e.getMessage());
//            }

///////<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<ModifierPanier>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
//
//try {
//           
//            Panier panierModifie = new Panier();
//            Date date = new Date(); 
//             
//            panierModifie.setDatePanier(date); 
//            panierModifie.setTotal(123 ); 
//            
//            
//           int idoffre =4;
//            int idPanierAModifier =2;
//           
//            servicePanier.modifier(idPanierAModifier, panierModifie,idoffre);
//
//            System.out.println("Mise à jour de l'Panier réussie !");
//        } catch (SQLException e) {
//            System.err.println("Erreur lors de la mise à jour de l'Panier : " + e.getMessage());
//        }
    

///////<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<SupprimerPanier>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><
//
//int idPanierASupprimer = 2; // Remplacez par l'ID de l'avis que vous souhaitez supprimer
//    
//    try {
//        
//        servicePanier.supprimer(idPanierASupprimer);
//        System.out.println("Panier supprimé avec succès !");
//    } catch (SQLException e) {
//        System.err.println("Erreur lors de la suppression de l'Panier : " + e.getMessage());
//    }


///////<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<RecupirerPanier>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><


//
//try {
//    
//    List<Panier> listePaniers = servicePanier.recuperer();
//
//    
//    for (Panier panier : listePaniers) {
//        System.out.println("ID de l'Panier: " + panier.getIdPanier());
//        System.out.println("Date de l'Panier: " + panier.getDatePanier());
//        System.out.println("Prix de l'Panier: " + panier.getTotal());
//        System.out.println("Id  de l'Offre: " + panier.getOffre().getIdOffre());
//        System.out.println("Id user de l'Panier: " + panier.getUser().getIduser());
//      
//        
//        if (panier.getUser() != null) {
//            System.out.println("ID de l'Utilisateur associé: " + panier.getUser().getIduser());
//            System.out.println("Nom de l'Utilisateur associé: " + panier.getUser().getNom());
//        } else {
//            System.out.println("Aucun utilisateur associé à cette panier.");
//        }
//
//        System.out.println("-----------------------------------");
//    }
//} catch (SQLException e) {
//    System.err.println("Erreur lors de la récupération des panier : " + e.getMessage());
//}
//
//










}
}
//