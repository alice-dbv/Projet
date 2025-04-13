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
    private String type;
    private float x;
    private float y;
    private boolean dispo;
    private EtatMachine etatMachine;
    private Operation operations;
    private Poste poste;

   

    public Machine(String refMachine, String dMachine, float x, float y,float cout, Operation operations, String type,Poste poste) {
       super(refMachine, dMachine, cout);
        this.x = x;
        this.dispo = true;
        this.y = y;
        this.etatMachine = EtatMachine.OPERATIONNEL;
        this.operations = operations;
        this.type = type;
        this.poste=null;
    }

    public float getX() {
        return x;
    }

    public Poste getPoste() {
        return poste;
    }

    public boolean estDispo() {
        return dispo;
    }

    public float getY() {
        return y;
    }

    public EtatMachine getEtatMachine() {
        return etatMachine;
    }

    public Operation getOperations() {
        return operations;
    }

    public String getType() {
        return type;
    }

       public void setX(float x) {
        this.x = x;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setEtatMachine(EtatMachine etatMachine) {
        this.etatMachine = etatMachine;
    }

    public void setOperations(Operation operations) {
        this.operations = operations;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public void afficheMachine(){
     super.afficheEquipement();
      System.out.println("Machine de type:" +this.type+", localisation: "+this.x+","+this.y+", etat:"+this.etatMachine+", disponibilite:"+this.dispo);
      System.out.print("Operation de cette machine:");
      operations.afficheOperation();
   }
    
    public void modifierMachine(float newx, float newy, float newcout, String newtype, EtatMachine newetat, Operation newoperations,String newrefMachine,String newdMachine){
        if (newrefMachine != null && !newrefMachine.isEmpty()) {
        super.setRefEquipement(newrefMachine);}
       if (newdMachine != null && !newdMachine.isEmpty()) {
        super.setdEquipement(newdMachine);}
        if (newx!=0){
            this.x=newx;
        }
        if (newy != 0) this.y = newy;
        if (newcout != 0) super.setCout(newcout);
        if (newtype != null && !newtype.isEmpty()) this.type = newtype;
        //if (newt != 0) this.t = newt; comme on a elevé t de la classe Machine: plus besoin
        if (newetat != null) this.etatMachine = newetat;
        if (null!=newoperations) this.operations=newoperations;
        System.out.println("Machine modifiee !");
    }
    
    public boolean estOperationnel(){
        return this.etatMachine==EtatMachine.OPERATIONNEL; // vérifie si machine opérationnelle, on a une classe spéciale EtatMachine pour donner juste els différents types
    }
   public void supprimerMachine(){
       if (poste!= null){
           poste.modifierPoste(poste,this,false);
           System.out.println("Machine " + super.getRefEquipement() + " supprimée du poste.");
        } else {
            System.out.println("Erreur : La machine n'est pas associée à un poste.");
        }
    }
    
    public float getCoutHoraire() { // Implémentation de la méthode abstraite de Equipement
        return super.getCout();
    }
   } 
    
    
    
    

