/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

/**
 *
 * @author lisaa
 */
public class Machine extends Equipement {
   private float x;
   private float y;
   private float cout;
   private String type;
   private float t;
   private String etat;
   private Operation operations;

    public String getRefMachine() {
        return super.getRefEquipement();
    }

    public String getdMachine() {
        return super.getdEquipement();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getCout() {
        return cout;
    }

    public String getType() {
        return type;
    }

    public float getT() {
        return t;
    }

    public String getEtat() {
        return etat;
    }

    public Operation getOperations() {
        return operations;
    }

    public void setRefMachine(String refMachine) {
        super.setRefEquipement(refMachine);
    }

    public void setdMachine(String dMachine) {
        super.setdEquipement(dMachine);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setT(float t) {
        this.t = t;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setOperations(Operation operations) {
        this.operations = operations;
    }

    public Machine(float x, float y, float cout, String type, float t, String etat, Operation operations) {
        this.x = x;
        this.y = y;
        this.cout = cout;
        this.type = type;
        this.t = t;
        this.etat = etat;
        this.operations = operations;
    }

  
   
   public void afficheMachine(){
       
}
   public boolean estDisponible (){
       
        return false;
       
   }
   public boolean estOperationnel(){
    
        return false;
    
}
   public void modifierMachine(){
       
      
   }
   public void supprimerMachine(){
       
   }
}
