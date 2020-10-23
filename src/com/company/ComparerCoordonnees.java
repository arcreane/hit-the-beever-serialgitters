package com.company;

/**
 * @author Rabeb, Mathieu
 */
public class ComparerCoordonnees {

    //comparateur de la reponse du joueur avec celui du beavers B

    public static int compare (String playerCoords, String beaverCoords ){
        int compteur =0;
        if (playerCoords == beaverCoords) {
             compteur=1;
        }
        return compteur;
    }

}
