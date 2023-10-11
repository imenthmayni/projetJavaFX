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
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Panier {
    private int idPanier;
    private List<Offre> listeOffres;
    private int total;
    private Date datePanier;
    private Offre Offre;
    private User user;

    public Panier(int idPanier, List<Offre> listeOffres, int total, Date datePanier, Offre Offre) {
        this.idPanier = idPanier;
        this.listeOffres = listeOffres;
        this.total = total;
        this.datePanier = datePanier;
        this.Offre = Offre;
    }

    public Panier(int idPanier, List<Offre> listeOffres, int total, Date datePanier) {
        this.idPanier = idPanier;
        this.listeOffres = listeOffres;
        this.total = total;
        this.datePanier = datePanier;
    }

    public Panier(int idPanier, List<Offre> listeOffres, int total, Date datePanier, Offre Offre, User user) {
        this.idPanier = idPanier;
        this.listeOffres = listeOffres;
        this.total = total;
        this.datePanier = datePanier;
        this.Offre = Offre;
        this.user = user;
    }
    
 public static int calculerTotalPanier(List<Offre> offres) {
    int total = 0;
    for (Offre offre : offres) {
        total += offre.getValeurOffre();
    }
    return total;
}

    public int getIdPanier() {
        return idPanier;
    }

    public void setIdPanier(int idPanier) {
        this.idPanier = idPanier;
    }

    public Panier() {
    }


    public List<Offre> getListeOffres() {
        return listeOffres;
    }

    public void setListeOffres(List<Offre> listeOffres) {
        this.listeOffres = listeOffres;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getDatePanier() {
        return datePanier;
    }

    public void setDatePanier(Date datePanier) {
        this.datePanier = datePanier;
    }

    public Offre getOffre() {
        return Offre;
    }

    public void setOffre(Offre Offre) {
        this.Offre = Offre;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
