package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class scoreGame {
    Scanner scanner = new Scanner(System.in);
    String inputName = new scanner. ;
    int score ;
    String[][] arrayScore = new string[inputName][Integer.parseInt(score)];

    //fonction pour sauvegarder les scores

    private static String saveScore (int score){
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayScore[inputName]+" "+arrayScore[i]);
        }

    return saveScore(score);}

    //trier le tableau de score dans l ordre decroissant

    public static String arrayScore(int score){

        int temp ;
        for (int i = 0; i < 5; i++) {
            for (int j=i+1 ; j<5 ;j++) {


                if ((arrayScore[inputName][j]) > (arrayScore[inputName][i])) {
                    temp = arrayScore[j];
                    arrayScore[j] = arrayScore[i];
                    arrayScore[i] = temp;
                }

            }
        }saveScore(score)++ ;
     return arrayScore(score) ;
    }
}
