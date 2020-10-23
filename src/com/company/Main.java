package com.company;

import java.util.Scanner;

public class Main {
    /**
     * @author Jesusa, Mathieu
     * @param args
     */
    public static void main(String[] args) {
        Boolean continuer = true;
        do {
            Scanner input = new Scanner(System.in);
            //création de menu
            System.out.println("Menu:");
            System.out.println("1 : Nouvelle Partie");
            System.out.println("2 : Résultats");
            System.out.println("3 : Quitter");

            String menu = input.nextLine();
           if(menu.equals("1")) { //Si on lance une partie
               //On initialise le score à 0
               int scoreJoueur=0;
               System.out.println("menu : nouvellePartie");
               int difficulte = NiveauDeJeu.nouvellePartie(); //On appelle le menu de choix de difficulté et on stocke la difficulté (nb de cases) dans un int
               //Appel fonction de raffraichissement avec en param le nb de cases (difficulté) et stockage de la string qu'il faudra comparer avec entrée joueur
               String coordonneesMarmotte = PlateauDeJeu.refresh(difficulte);

               //Lancement du timer et récupération de la string de coordonnées rentrées par le joueur
               //String coordonneesJoueur = TimerTime.run();

               //Comparaison coordonnées entrées par joueur et position réelle de la marmotte, si match = incrémente le score de 1 sinon incrémente de zéro
               //int incrementationScore = comparerCoordonnees.compare(coordonneesJoueur,coordonneesMarmotte);
               //scoreJoueur=scoreJoueur+incrementationScore;

               //Appel de la fonction d'enregistrement des scores pour stocker le score utilisateur dans le tableau des scores

               //Si le score final est de zero, game over - sinon affichage du score final

           }else if(menu.equals("2")){
               System.out.println("menu : resultat");
               //Appel fonction d'affichage de scores

           }else if(menu.equals("3")){
               //Si choix 3, on passe la variable continue à false puis on quitte la boucle
               System.out.println("menu : quitter");
               continuer=false;
           }else {
               System.out.println("Entrée incorrecte");
           }
        }while(continuer);

    }
}
