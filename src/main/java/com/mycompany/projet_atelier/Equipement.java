/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

/**
 *
 * @author lisaa
 */
public abstract class Equipement {
  private String dEquipement;
   private String refEquipement ;
   float cout;

    public float getCout() {
        return cout;
    }

    public String getdEquipement() {
        return dEquipement;
    }

    public String getRefEquipement() {
        return refEquipement;
    }
    
    public Equipement(String refEquipement, String dEquipement, float cout) {
        this.refEquipement = refEquipement; //mettre le nom de l'équipement, ex: scieuse, ponceuse
        this.dEquipement = dEquipement;
        this.cout = cout;
            }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }
    

    public void afficheEquipement(){
        System.out.println("Equipement:"+this.dEquipement+", de reference "+this.refEquipement+", Cout horaire: "+ this.cout);
    }
   
    
}
