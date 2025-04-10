/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;


/**
 *
 * @author lisaa
 */
public class Produit {
    private float codeProduit;
    private String dproduit;

    public Produit(float codeProduit, String dproduit) {
        this.codeProduit = codeProduit;
        this.dproduit = dproduit;
    }

    public float getCodeProduit() {
        return codeProduit;
    }

    public String getDproduit() {
        return dproduit;
    }

    public void setCodeProduit(float codeProduit) {
        this.codeProduit = codeProduit;
    }

    public void setDproduit(String dproduit) {
        this.dproduit = dproduit;
    }
    
public void afficheProduit(){
    System.out.println("Produit: code "+this.codeProduit+", désignation "+this.dproduit);
}
public void modifierProduit(float nouveauCodeProduit, String nouveauDProduit) {
        if (nouveauCodeProduit>0) {
            this.codeProduit = nouveauCodeProduit;
        } else {
        }
        if (nouveauDProduit != null && !nouveauDProduit.isEmpty()) {
            this.dproduit = nouveauDProduit;
        }
    }

public void supprimerProduit(){
    
}
}
