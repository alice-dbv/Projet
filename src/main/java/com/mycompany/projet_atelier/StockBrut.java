/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

import java.util.ArrayList;

/**
 *
 * @author lisaa
 */
public class StockBrut {
    
    private final ArrayList<String> listeStock=new ArrayList<>();

      // Ajouter un élément au stock
    public void ajouterAuStock(String element) {
        listeStock.add(element);
    }
    public void supprimerAuStock(String element) {
        listeStock.remove(element);
    }

    // Afficher le contenu du stock
    public void affiche(){
        if (listeStock.isEmpty()) {
            System.out.println("Le stock BRUT est vide.");
        } else {
            System.out.println("Stock BRUT :");
            for (String element : listeStock) {
                System.out.println("- " + element);
            }
        }
    }
}

    
    

