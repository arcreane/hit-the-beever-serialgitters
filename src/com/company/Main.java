package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
                NiveauDeJeu.nouvellePartie();
                break;
            case "2":
                System.out.println("menu : resultat");
                break;
            case "3":
                System.out.println("menu : quitter");
                break;
            default:
                System.out.println("vous avez pas mis le bon choix");
        }

    }
}
