/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ProjetAtelier {
    
    public static void main(String[] args) {
        Operateur Ouvrier1 = new Operateur("scier", true, 001, "Alain", "Louris");
        ChefAtelier Boss = new ChefAtelier(002, "JR", "Heu");
        Operation Sciage = new Operation("sciage", "op1", "scieuse", 3);
        Operation Poncage = new Operation("poncage", "op2", "ponceuse", 3);
        Machine Scieuse = new Machine("scieuse1","m1", 0, 0, true, 18, 10, "neuf", Sciage, "scie", null);
        Poste Poste1 = new Poste(new ArrayList<Machine>() {{add(Scieuse);}}, "1", "poste1");
        Scieuse.setPoste(Poste1);
        System.out.println("nouvel Atelier");
        //Ouvrier1.afficher(); 
        //Boss.afficher(); 
        //Sciage.afficheOperation(); 
        //System.out.println("Poncage");
        //Poncage.afficheOperation(); 
        //System.out.println("Poste1");
        //Poste1.affichePoste(); 
        //System.out.println("Scieuse ");
        //Scieuse.afficheMachine();
        
    }
}
