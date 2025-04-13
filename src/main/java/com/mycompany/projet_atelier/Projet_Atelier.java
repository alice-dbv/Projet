/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet_atelier;
import java.util.ArrayList;

/**
 *
 * @author alicedeboever
 */
public class Projet_Atelier {

    public static void main(String[] args) {
    Operateur Ouvrier1 = new Operateur("scier", true, 001, "Alain", "Louris");
        ChefAtelier Boss = new ChefAtelier(002, "JR", "Heu");
        Operation Sciage = new Operation("sciage", "op1", "scieuse", 1);
        Operation Poncage = new Operation("poncage", "op2", "ponceuse", 2);
        Operation Cuisson = new Operation("cuisson", "op3", "four", 5);
        Machine Scieuse = new Machine("scieuse","m1", 0, 0, 3, Sciage, "scie", null);
        Machine Ponceuse = new Machine("ponceuse","m2", 4, 4,5,Poncage, "ponceuse", null);
        Machine Four = new Machine("four", "m3", 2, 1,6, Cuisson, "four", null);
        Scieuse.setDispo(false);
        Scieuse.setEtatMachine(EtatMachine.ARRET_PANNE);
        Poste Poste1 = new Poste(new ArrayList<Machine>() {{add(Scieuse);}}, "1", "poste1");
        Scieuse.setPoste(Poste1);
        Ponceuse.setPoste(Poste1);
        Gamme Table = new Gamme("table1",new ArrayList<Operation>() {{add(Sciage);add(Poncage);}}, new ArrayList<Equipement>() {{add(Scieuse);add(Ponceuse);}});
        System.out.println("nouvel Atelier");
        //Ouvrier1.afficher(); 
        //Boss.afficher(); 
        //Sciage.afficheOperation(); 
        //System.out.println("Poncage");
        //Poncage.afficheOperation(); 
        System.out.println("Poste1");
        Poste1.affichePoste(); 
        Poste1.modifierPoste(Poste1, Four, true);
        System.out.println("Poste1 modifie");
        Poste1.affichePoste();
        //System.out.println("Scieuse ");
        //Scieuse.afficheMachine();
        //Scieuse.modifierMachine(1, 1, 2, "scie", "usee", Sciage, "scieuse", "m1");
        //System.out.println("Scieuse modifiee ");
        //Scieuse.afficheMachine();
        //System.out.println(Table.coutGamme());
        
    }       
}