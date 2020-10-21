package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class round {

    public static String refresh(int difficulte){
        String[][] plateau= new String[difficulte][difficulte];
        //Initialisation des valeurs random pour axes x et y
        int actualX=ThreadLocalRandom.current().nextInt(0, difficulte);
        int actualY=ThreadLocalRandom.current().nextInt(0, difficulte);
        String reponse = actualX+" "+actualY;


        //Utilisation de boucles imbriquées pour assigner une valeur pour chaque coordonnée
        for (int row=0; row<plateau.length; row++) {
            for (int col=0; col<plateau[row].length; col++) {
                //Si les coordonnées sont celles de l'apparition de la marmotte on affiche un B, sinon rien
                if(row==actualX && col==actualY){
                    plateau[row][col]="[B]";
                    System.out.println(plateau[row][col]);
                }else{
                    plateau[row][col]="[ ]";
                    System.out.println(plateau[row][col]+" ");
                }
                System.out.println();
            }
        }
        //Retourne les coordonnées exactes de la marmotte pour comparaison avec entrée scannée
        return reponse;
    }
}
