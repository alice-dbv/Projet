/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

/**
 *
 * @author alicedeboever
 */
public class ChefAtelier extends Personne {
    // faut importer les noms prenoms et code de la classe abstraite personne
    public ChefAtelier(float code, String nom, String prenom) {
        super(code, nom, prenom);
    }
    @Override
    public void afficher() {
        System.out.println("Ched d'atelier: "+this.getPrenom()+", "+this.getNom()+",code: "+this.getCode());  
    }
}
