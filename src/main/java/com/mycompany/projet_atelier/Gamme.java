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
    
    public void creerGamme(){
        
    }
    
    public void modifiergamme(){
        
    }
    
    public void supprimmerGamme(){
        
    }
    
    public void afficheGamme(){
        
    }
    
    public float coutGamme(){
        return 4;
    }
    
    public float dureeGamme(){
        return 3;
        
    }

}
