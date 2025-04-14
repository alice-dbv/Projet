/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class AtelierDeFabrication {
    private String nom;
    private ArrayList<Equipement> listEquipement=new ArrayList<>();
    int nbPostes=getNombrePostes();
    private StockBrut stockbrut;
    private ArrayList<ProduitsFinis> produitsFinis = new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public int getNbPostes() {
        return nbPostes;
    }

    public StockBrut getStockbrut() {
        return stockbrut;
    }

    public ArrayList<Equipement> getListEquipement() {
        return listEquipement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbPostes(int nbPostes) {
        this.nbPostes = nbPostes;
    }

    public void setStockbrut(StockBrut stockbrut) {
        this.stockbrut = stockbrut;
    }

    public void setListEquipement(ArrayList<Equipement> listEquipement) {
        this.listEquipement = listEquipement;
    }

    public AtelierDeFabrication(String nom, StockBrut stockbrut,ArrayList<Equipement> listEquipement,ArrayList<ProduitsFinis> produitsfinis) {
        this.nom = nom;
        this.stockbrut = stockbrut;
        this.listEquipement=listEquipement;
        this.produitsFinis=produitsfinis;
    }

    public ArrayList<ProduitsFinis> getProduitsFinis() {
        return produitsFinis;
    }

    public void setProduitsFinis(ArrayList<ProduitsFinis> produitsFinis) {
        this.produitsFinis = produitsFinis;
    }

    

    // Méthode pour compter le nombre de postes dans l'atelier
    public int getNombrePostes() {
        int nombrePostes = 0;
        for (Equipement eq : listEquipement) {
            if (eq instanceof Poste) {
                nombrePostes++;
            }
        }
        return nombrePostes;
    }
    public void ajoutEquipement(Equipement equipement) {
    this.listEquipement.add(equipement);
    System.out.println("Equipement " + equipement.getRefEquipement() + " ajouté à l'atelier " + this.nom + "!");
}

public void enleverEquipement(Equipement equipement) {
    if (listEquipement.remove(equipement)) {
        System.out.println("Equipement " + equipement.getRefEquipement() + " retiré de l'atelier !");
    } else {
        System.out.println("Cet équipement n'est pas présent dans l'atelier " );
    }
}
public void affiche(){
    System.out.println("Atelier de fabrication, nom:"+this.nom);
    System.out.println("Equipements de cet atelier:"+listEquipement.size());
    System.out.println("Nombre de postes:"+nbPostes);
    System.out.println("Stock:"+stockbrut);

}

}
