/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

/**
 *
 * @author lisaa
 */
public class Equipement {
   private String refOperation;
   private String dEquipement;

    public String getRefOperation() {
        return refOperation;
    }

    public String getdEquipement() {
        return dEquipement;
    }

    public void setRefOperation(String refOperation) {
        this.refOperation = refOperation;
    }

    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }

    public Equipement(String refOperation, String dEquipement) {
        this.refOperation = refOperation;
        this.dEquipement = dEquipement;
    }
   
   
}
