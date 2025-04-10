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
    private int dispo;
    private float y;
    private float cout;
    private float t;
    private String etat;
    private Operation operations;
    private String type;

    public Machine(float x, int dispo, float y, float cout, float t, String etat, Operation operations, String type) {
        this.x = x;
        this.dispo = dispo;
        this.y = y;
        this.cout = cout;
        this.t = t;
        this.etat = etat;
        this.operations = operations;
        this.type = type;
    }
public String getRefMachine(){
    return super.getRefEquipement();
}
    public String getdMachine(){
        return super.getdEquipement();
    }
    public float getX() {
        return x;
    }

    public int getDispo() {
        return dispo;
    }

    public float getY() {
        return y;
    }

    public float getCout() {
        return cout;
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

    public String getType() {
        return type;
    }

    public void setRefMachine (String refMachine){
        super.setRefEquipement(refMachine);
    }
    
    public void setdMachine (String dMachine){
        super.setdEquipement(dMachine);
    }
    public void setX(float x) {
        this.x = x;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setCout(float cout) {
        this.cout = cout;
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

    public void setType(String type) {
        this.type = type;
    }
    
    public void afficheMachine(){
        super.afficher();
        System.out.println("Machine de type:" +this.type+"localisation "+this.x+","+this.y+"état:"+this.etat+"disponibilité:"+this.dispo);
        System.out.println("Operations:"+this.operations+"cout"+this.cout+"temps t:"+this.t);
    }
    
    public void modifierMachine(){
        
    }
   public boolean estDisponible(){
     return false;  
   } 
    public boolean estOperationnel(){
        return false;
    }
   public void supprimerMachine(){
       
   } 
    
    
    
    
}

