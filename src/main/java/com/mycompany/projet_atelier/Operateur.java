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
    private float code ;
    private String nom ;
    private String prenom ;
    private String competance ;
    private boolean disponible ; 

    public float getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCompetance() {
        return competance;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCode(float code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCompetance(String competance) {
        this.competance = competance;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Operateur(float code, String nom, String prenom, String competance, boolean disponible) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.competance = competance;
        this.disponible = disponible;
    }
    
    
    
}
