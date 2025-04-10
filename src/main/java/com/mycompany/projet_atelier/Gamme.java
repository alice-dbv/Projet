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
public class Gamme {
    private String refGamme ;
    private ArrayList<Operation> listeOperation;
    private ArrayList<Equipement> listeEquipement ;

    public String getRefGamme() {
        return refGamme;
    }

    public ArrayList<Operation> getListeOperation() {
        return listeOperation;
    }

    public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public void setListeOperation(ArrayList<Operation> listeOperation) {
        this.listeOperation = listeOperation;
    }

    public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
    }

    public Gamme(String refGamme, ArrayList<Operation> listeOperation, ArrayList<Equipement> listeEquipement) {
        this.refGamme = refGamme;
        this.listeOperation = listeOperation;
        this.listeEquipement = listeEquipement;
    }
    
    public void creerGamme(String refGamme) {
        this.refGamme = refGamme;
        this.listeOperation.clear();
        this.listeEquipement.clear();
        System.out.println("Nouvelle gamme créée avec la référence: " + refGamme);
    }
    
    public void modifierGamme(String newRefGamme) {
        this.refGamme = newRefGamme;
        System.out.println("Référence de la gamme modifiée avec succès!");
    
    }
    
    public void supprimmerGamme(){
     this.refGamme = null;
        this.listeOperation.clear();
        this.listeEquipement.clear();
        System.out.println("Gamme supprimée avec succès!");   
    }
    
    public void afficheGamme(){
         System.out.println("Gamme [Référence: " + refGamme + "]");
        System.out.println("Liste des équipements nécessaires (" + listeEquipement.size() + "):");
        for (Equipement e : listeEquipement) {
            e.afficheEquipement();
            System.out.println();
    }
        System.out.println("Liste des opérations (" + listeOperation.size() + "):");
        for (int i = 0; i < listeOperation.size(); i++) {
            System.out.println("Étape " + (i+1) + ":");
            listeOperation.get(i).afficheOperation();
            System.out.println();
        }
        System.out.println("Coût total de la gamme: " + coutGamme() + " €");
        System.out.println("Durée totale de la gamme: " + dureeGamme() + " h");
    }
    
    public float coutGamme(){
        float coutTotal = 0;
        
        // Pour chaque opération, trouver l'équipement correspondant et calculer le coût
        for (Operation op : listeOperation) {
            for (Equipement eq : listeEquipement) {
                if (eq.getRefEquipement().equals(op.getRefEquipement())) {
                    coutTotal += op.calculerCout(eq);
                    break;
                }
            }
        }
        
        return coutTotal;
    }
    
    public float dureeGamme(){
        float dureeTotal = 0;
        
        // Somme des durées de toutes les opérations
        for (Operation op : listeOperation) {
            dureeTotal += op.getDureeOperation();
        }
        
        return dureeTotal;
    }

}
