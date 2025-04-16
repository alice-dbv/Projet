/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet_atelier;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alicedeboever
 */
public class Projet_Atelier {

    public static void main(String[] args) {
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
                }
            }
            in.close();          
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    
//pour chaque machine, calculer la durée en arrêt
    for(String m: machines){
        DateTimeFormatter formatHeure = DateTimeFormatter.ofPattern("HH:mm");
        List<String> evenements = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader("suiviMaintenance.txt"));
            String ligne;
            while ((ligne = in.readLine()) != null) {
                String[] parts = ligne.split(" "); //sépare chaque ligne en tableau, un mot=une case
                if (parts.length >= 4) {
                    String heure = parts[1];
                    String machine = parts[2];
                    String evenement = parts[3]; // "A" ou "D"

                    if (machine.equals(m)) {
                        evenements.add(heure + " " + evenement);
                    }
                }
            }
            in.close();
            // Traitement : calcul des durées entre A et D
            LocalTime debut = null; //LocalTime = classe spéciale pr les heures
            long totalMinutes = 0; //long = chiffres longs

            System.out.println("Événements pour la machine : " + m);
            for (String evt : evenements) {
                String[] split = evt.split(" "); // Sépare "08:15 A" en ["08:15", "A"]
                LocalTime heure = LocalTime.parse(split[0], formatHeure); // Convertit "08:15" en un objet heure
                String type = split[1]; //"A" ou "D"

                if (type.equals("A")) {  //cas ou on rencontre un A pour la première fois
                    debut = heure; //on enregistre heure de début de la panne
                    
                } else if (type.equals("D") && debut != null) { //cas où on rencontre un D et qu'on a eu un A juste avant
                    Duration duree = Duration.between(debut, heure);  // Calcul de durée entre l’heure du A et celle du D
                    long minutes = duree.toMinutes();  //le convertit en minute
                    System.out.println(" Durée de panne : " + minutes + " minutes");
                    totalMinutes += minutes;  // ajoute cette durée à la durée totale de panne
                    debut = null;  //réinitialise heure de début, jusqu'au prochain A croisé
                }
            }

            System.out.println("Total des pannes : " + totalMinutes + " minutes");
            long n= 100*(1-totalMinutes/840);  //840= minutes entre 6h et 20h
            System.out.println("fabilité de la machine: "+ n);

        } catch (IOException e) {
            System.err.println("Erreur de lecture : " + e.getMessage());
        }
    }
    //pour chaque machine, calculer la fiabilité
    
    //TEST METHODES STOCKBRUT
    //StockBrut stockbrut = new StockBrut();
    
    //stockbrut.ajouterAuStock("Bois");
    //stockbrut.ajouterAuStock("Acier");
    
    //stockbrut.afficheStock();
    
    // TEST METHODES PRODUIT 
        // Création des opérations et équipements
        //Operation sciage = new Operation("scieuse", "Sciage", "scieuse", 1);
        //Equipement scie = new Machine("scieuse", "m1", 0, 0, 3, sciage, "scie", null);
    

    //TEST ATELIER DE FABRICATION
        //Poste Poste1 = new Poste(new ArrayList<Machine>(), "1", "poste de sciage");
        //Poste Poste2 = new Poste(new ArrayList<Machine>(),"2","Poste de perçage");
        
        //AtelierDeFabrication ChezJRH = new AtelierDeFabrication("Chez JRH", null, new ArrayList<Equipement>(), new ArrayList<>());
        //ChezJRH.ajoutEquipement(Poste2);
        //ChezJRH.enleverEquipement(Poste1);
        //System.out.println("Nb poste "+ ChezJRH.getNbPostes());
    // TEST METHODES PRODUIT    
    
        //Produit chaise = new Produit(101, "Chaise en bois", new ArrayList<>());
        //Operation Sciage = new Operation("sciage", "op1", "scieuse", 1);
        //Machine Scieuse = new Machine("scieuse","m1", 0, 0, 3, Sciage, "scie", null);
        //Gamme Table =new Gamme("table1",new ArrayList<Operation>() {{add(Sciage);}}, new ArrayList<Equipement>(){{add(Scieuse);}}) ;
        //Operation Poncage = new Operation("poncage", "op2", "ponceuse", 2);
        //Machine Ponceuse = new Machine("ponceuse","m2", 4, 4,5,Poncage, "ponceuse", null);
        //System.out.println("État initial du produit :");
    
        //Table.afficheGamme();
        //Table.ajoutEquipementOperation(Ponceuse, Poncage);
        //Table.modifierGamme("table2");
        //chaise.supprimerProduit();
        //chaise.modifierProduit(202, "Chaise en métal");
        //Table.supprimerGamme();
        //System.out.println("État après modification :");
        //Table.afficheGamme();
    
        //Table.enleverEquipementOperation(Scieuse,Sciage);
        //Table.afficheGamme();
        //chaise.ajouterGamme(Table);
        //System.out.println("Nombre de gammes après ajout : " + chaise.getListeGamme().size());

        // Test retrait
        //chaise.retirerGamme(Table);
        //System.out.println("Nombre de gammes après retrait : " + chaise.getListeGamme().size());

        
    // TEST METHODES MACHINES ET OPERATIONS    
        //Operateur Ouvrier1 = new Operateur("scier", true, 001, "Alain", "Louris");
        //ChefAtelier Boss = new ChefAtelier(002, "JR", "Heu");
        Operation Sciage = new Operation("sciage", "op1", "scieuse", 1);
        Operation Poncage = new Operation("poncage", "op2", "ponceuse", 2);
        Operation Cuisson = new Operation("cuisson", "op3", "four", 5);
        ArrayList<Operation> listeOperation = new ArrayList<>();
        listeOperation.add(Sciage);
        Machine Scieuse = new Machine("scieuse","m1", 0, 0, 3, listeOperation, "scie", null, new ArrayList<>());
        //Scieuse.afficheMachine();
        //Scieuse.ajouterOperationRealisable(Cuisson);
        //Scieuse.afficheMachine();
        
    // TEST METHODE POSTE
        Machine Ponceuse = new Machine("ponceuse","m2", 4, 4,5,new ArrayList<Operation>(Arrays.asList(Poncage)), "ponceuse", null, new ArrayList<>());
        Machine Four = new Machine("four", "m3", 2, 1,6, new ArrayList<Operation>(Arrays.asList(Cuisson)), "four", null, new ArrayList<>());
        //Scieuse.setDispo(false);
        //Scieuse.setEtatMachine(EtatMachine.ARRET_PANNE);
        Poste Poste1 = new Poste(new ArrayList<Machine>() {{add(Scieuse);add(Ponceuse);}}, "1", "poste1");
        Scieuse.setPoste(Poste1);
        Ponceuse.setPoste(Poste1);
        //Gamme Table = new Gamme("table1",new ArrayList<Operation>() {{add(Sciage);add(Poncage);}}, new ArrayList<Equipement>() {{add(Scieuse);add(Ponceuse);}});
        //System.out.println("nouvel Atelier");
        //Ouvrier1.afficher(); 
        //Boss.afficher(); 
        //Sciage.afficheOperation(); 
        //System.out.println("Poncage");
        //Poncage.afficheOperation(); 
        //System.out.println("Poste1");
        //Poste1.affichePoste(); 
        //Poste1.modifierPoste(Poste1, Four, true);
        //System.out.println("Poste1 modifie");
        //Poste1.affichePoste();
        //Ponceuse.supprimerMachine();
        //Poste1.affichePoste();
        //Poste1.supprimerPoste();
        //System.out.println("Scieuse ");
        //Scieuse.afficheMachine();
        //Scieuse.modifierMachine(1, 1, 2, "scie", "usee", Sciage, "scieuse", "m1");
        //System.out.println("Scieuse modifiee ");
        //Scieuse.afficheMachine();
        //System.out.println(Table.coutGamme());  
    }  
}