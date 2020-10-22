package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean keepUp = false;
        do {
            //Appel des fonctions etc
            board.refresh(5);


            //A remplacer par le menu de sélection partie, highscore et quit
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
