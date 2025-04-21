/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_atelier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author PC
 */
public class TestFichier {
    public void Test(){
    System.out.println("fiabilité MACHINE");
      //établis liste des machines étudiées dans la fichier suiviMaintenance"
        ArrayList<String> machines = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("suiviMaintenance.txt"));
            String ligne;

            while ((ligne = in.readLine()) != null) {
                StringTokenizer t = new StringTokenizer(ligne, " ");
                if (t.hasMoreTokens()) {
                    t.nextToken(); // saute 1er
                    t.nextToken(); // saute 2ème
                    String machine = t.nextToken();
                    
                    // Vérifie si la machine est déjà enregistrée
                    if (!machines.contains(machine)) {
                        machines.add(machine);
                    }
                } else {
                    System.out.println("Ligne ignorée (pas assez d'informations) : " + ligne);
                }
            }
            in.close();          
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    
    }
}
