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

public void affiche(){
    System.out.println("Atelier de fabrication, nom:"+this.nom);
    System.out.println("Equipements de cet atelier:"+listEquipement.size());

}

}
