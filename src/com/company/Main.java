package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean keepUp = false;
        do {
            //Appel des fonctions etc



            //Demande si utilisateur veut continuer
            Scanner sc = new Scanner(System.in);
            System.out.println("Recommencer?");
            String reponse = sc.nextLine();
            //Si la réponse est Y, on définit keepUp à true
            if(reponse.equals("Y")){
                keepUp=true;
            }
        }while(keepUp);
    }
}
