package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class scoreGame {
    Scanner scanner = new Scanner(System.in);
    String inputName = new scanner. ;
    int score ;
    String[][] arrayScore = new string[inputName][Integer.parseInt(score)];

    //fonction pour sauvegarder les scores

    public static String saveScore (int score){
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayScore[inputName]+" "+arrayScore[i]);
        }

    return saveScore(score);}

    //trier le tableau de score dans l ordre decroissant
    
    public static String arrayScore(int score){

        int temp ;
       if ((arrayScore[inputName][i+1])>(arrayScore[inputName][i])){
           temp =arrayScore[i+1];
           arrayScore[i+1]=arrayScore[i];
           arrayScore[i]=temp;}

       saveScore(score)++ ;
     return arrayScore(score) ;
    }
}
