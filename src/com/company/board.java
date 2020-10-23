package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class board {

    public static String refresh(int difficulty){
        String[][] plateau= new String[difficulty][difficulty];
        //Initialisation des valeurs random pour axes x et y
        int actualX=ThreadLocalRandom.current().nextInt(1, difficulty);
        int actualY=ThreadLocalRandom.current().nextInt(1, difficulty);
        //Incrémente de 1 la réponse pour qu'elle corresponde avec la position visuelle de la marmotte
        String actualCoordinates = (actualY)+" "+(actualX);

        System.out.print("  ");
        for(int col=0; col<difficulty; col++){
            System.out.print(" "+col+" ");
        }
        System.out.println(" ");
        //Utilisation de boucles imbriquées pour assigner une valeur pour chaque coordonnée
        for (int row=0; row<difficulty; row++) {
            System.out.print(row+" ");
            for (int col=0; col<difficulty; col++) {
                //Si les coordonnées sont celles de l'apparition de la marmotte on affiche un B, sinon rien
                if(row==actualX && col==actualY){
                    plateau[row][col]="[B]";
                    System.out.print(plateau[row][col]);
                }else{
                    plateau[row][col]="[ ]";
                    System.out.print(plateau[row][col]);
                }
            }
            System.out.println(" ");
        }
        return actualCoordinates; //Retourne les coordonnées exactes de la marmotte pour comparaison avec entrée scannée
    }



}
