package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean keepUp = true;
        do {
            //Appel des fonctions etc

            Scanner input = new Scanner(System.in);

            //création de menu
            System.out.println("Menu:");
            System.out.println("1 : Nouvelle Partie");
            System.out.println("2 : Résultats");
            System.out.println("3 : Quitter");

            String menu = input.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("menu : nouvellePartie");
                    break;
                case "2":
                    System.out.println("menu : resultat");
                    break;
                case "3":
                    System.out.println("menu : quitter");
                    keepUp=false;
                    break;
                default:
                    System.out.println("vous avez pas mis le bon choix");

            }
            System.out.println();


            //creation de niveau
            System.out.println("choissisez un niveau");
            System.out.println("1 : facile : 5x5, 4 seconds");
            System.out.println("2 : moyen : 7x7 , 3,5 seconds");
            System.out.println("3 : difficile : 10x10, 3 second");

            int difficulty;
            String choixNiveau = input.nextLine();
            switch (choixNiveau) {
                case "1":
                    difficulty=5;
                    System.out.println("Niveau : facile");
                    break;
                case "2":
                    difficulty=7;
                    System.out.println("Niveau : moyen");
                    break;
                case "3":
                    difficulty=10;
                    System.out.println("Niveau : difficile");
                    break;
                default:
                    System.out.println("Vous avez pas mis le bon choix");
            }System.out.println();

        }while(keepUp);
    }
}
