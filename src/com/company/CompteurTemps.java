package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Jesusa
 */

public class CompteurTemps extends TimerTask {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String[] getCoordonnes(String coordonees) {

        String[] joueurCoordonnees = new String[10];
        Scanner input = new Scanner(reader);
        String store = input.nextLine();
        System.out.println(store);

        System.out.println("Vous avez 10 tours!\nAppuyez sur clavier pour commencer\n");


        @Override
        public void run(){

            /*
            for (int i = 0; i < ; i++) {

            }
            */

            int n = 10;

            n--;
            if (n == 0) {
                Timer time = new Timer();
                time.cancel();
                System.exit(0);
            }
            CompteurTemps task = new CompteurTemps();
            Timer timer = new Timer();
            timer.schedule(task, 0, 4000);
            System.out.println("entrer coordonées: ");
        }

        //Scanner sc =new Scanner(reader);
        //coordoneesJoueur

        while (true) {
            try {
                if (!reader.ready()) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            run();
        }
    }

    @Override
    public void run() {

    }
}



