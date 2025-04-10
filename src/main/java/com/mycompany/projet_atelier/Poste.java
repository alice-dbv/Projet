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
public class Poste extends Equipement {
    private ArrayList<Machine> listeMachine;

    public String getRefPoste() {
        return super.getRefEquipement();
    }

    public String getdPoste() {
        return super.getdEquipement();
    }

    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }

    public void setRefPoste(String refPoste) {
        super.setRefEquipement(refPoste);
    }

    public void setdPoste(String dPoste) {
        super.setdEquipement(dPoste);
    }

    public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }

    public Poste(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }
    
    public void afficherPoste(){
        super.afficher();
        System.out.println("Liste des Machines de ce poste:");
        for (Machine i:this.listeMachine){
            i.afficheMachine();
        }
}
    public void modifierPoste(){
        
    }
    
    public void supprimerPoste(){
        
    }
}