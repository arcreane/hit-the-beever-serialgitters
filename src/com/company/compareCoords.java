package com.company;

public class compareCoords {

    //comparateur de la reponse du joueur avec celui du beavers B

    public static int compare (String playerCoords, String beaverCoords ){
        int compteur =0;
        if (playerCoords == beaverCoords) {
             compteur=1;
        }
        return compteur;
    }

}
