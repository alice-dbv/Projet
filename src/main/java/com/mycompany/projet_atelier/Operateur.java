/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

/**
 *
 * @author alicedeboever
 */
public class Operateur {
    
    private String competance ;
    private boolean disponible ; 

    public String getCompetance() {
        return competance;
    }

    public boolean isDisponible() {
        return disponible;
    }


    public void setCompetance(String competance) {
        this.competance = competance;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Operateur(String competance, boolean disponible) {
        this.competance = competance;
        this.disponible = disponible;
    }

    
    
    
    
}
