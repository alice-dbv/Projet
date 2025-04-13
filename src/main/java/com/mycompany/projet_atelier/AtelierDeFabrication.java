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

    public String getNom() {
        return nom;
    }

    public ArrayList<Equipement> getListEquipement() {
        return listEquipement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListEquipement(ArrayList<Equipement> listEquipement) {
        this.listEquipement = listEquipement;
    }

    public AtelierDeFabrication(String nom, ArrayList<Equipement> listEquipement) {
        this.nom = nom;
        this.listEquipement = listEquipement;
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
    
public void affiche(){
    System.out.println("Atelier de fabrication, nom:"+this.nom);
    System.out.println("Equipements de cet atelier:"+listEquipement.size());
    System.out.println("Nombre de postes:"+nbPostes);

}

}
