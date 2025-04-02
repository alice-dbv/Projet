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
public class Poste {
    private String refPoste;
    private String dPoste;
    private ArrayList<Machine> listeMachine;

    public String getRefPoste() {
        return refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }

    public Poste(String refPoste, String dPoste, ArrayList<Machine> listeMachine) {
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.listeMachine = listeMachine;
    }
    
    public void afficherPoste(){
    
}
    public void modifierMachine(){
        
    }
    
public void supprimerMachine(){
    
}
}