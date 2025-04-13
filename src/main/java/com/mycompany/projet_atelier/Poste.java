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
    private String dPoste;
    private String refPoste;

    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }
      public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }

    public Poste(ArrayList<Machine> listeMachine, String dPoste, String refPoste) {
        float n=0;
        super(dPoste, refPoste, n);
        this.listeMachine = listeMachine;
        for (Machine i:this.listeMachine){
            n=n+ i.getCout();
        }
        super.setCout(n);
        
    }
    
    public void affichePoste(){
        super.afficheEquipement();
        System.out.println("Liste des Machines de ce poste:");
        for (Machine i:this.listeMachine){
            i.afficheMachine();
        }
}
    public void modifierPoste(Poste poste, Machine machine, boolean ajouter){
       if (ajouter){
           poste.getListeMachine().add(machine); 
           System.out.println("Machine"+ machine.getRefEquipement() + " ajoutée au poste " );
            }
       else{
           if (poste.getListeMachine().contains(machine)){
               poste.getListeMachine().remove(machine);
               System.out.println("Machine supprimée du poste");
}else{
               System.out.println("La machine n'existe pas dans ce poste");
           }
       }      
    }
    
    
    public void supprimerPoste(){
        for (Machine machine : listeMachine) {
            machine.setPoste(null);  // On met la référence du poste à null dans chaque machine
        }
        
        // Maintenant, on vide la liste des machines associées à ce poste
        listeMachine.clear();

        // Après la suppression des machines, le poste peut être supprimé de l'application (pas d'autre action ici)
        System.out.println("Le poste " + refPoste + " a été supprimé.");
    }
   
    //@Override
    public float getCoutHoraire() {
        // Le coût horaire d'un poste est la somme des coûts horaires de ses machines
        float coutTotal = 0;
        for (Machine m : listeMachine) {
            coutTotal += m.getCout();
        }
        return coutTotal;
    } 
    
}
    
