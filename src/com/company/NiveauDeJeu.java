package com.company;

/**
 * @author Jesusa
 */

import java.util.Scanner;

public class NiveauDeJeu {

    public static int nouvellePartie() {
        Scanner input = new Scanner(System.in);

        //creation de niveau
        System.out.println("choissisez un niveau");
        System.out.println("1 : facile : 5x5, 4 seconds");
        System.out.println("2 : moyen : 7x7 , 3,5 seconds");
        System.out.println("3 : difficile : 10x10, 3 second");


        int difficulty=0;
        String choixNiveau = input.nextLine();
        if (choixNiveau.equals("1")) {
            System.out.println("Niveau : facile");
            difficulty = 5;
        } else if (choixNiveau.equals("2"))  {
            System.out.println("Niveau : moyen");
            difficulty = 7;
        } else if (choixNiveau.equals("3")) {
            System.out.println("Niveau : difficile");
            difficulty = 10;
        } else{
            System.out.println("Vous avez pas mis le bon choix");
        }
        System.out.println(difficulty);
        return difficulty;


    }

}

