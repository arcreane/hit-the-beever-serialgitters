package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class TimerTime extends TimerTask
{
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    public int n = 11;
    //@Override
    public void run()
    {   Timer time= new Timer();

        if(n==11)
            System.out.println();

        else {
            System.out.println(n);
            System.out.println("entrer coordonées: ");
        }
        Scanner sc =new Scanner(reader);
        //int input= reader.read();

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
        }

        n--;
        if (n==0){
            time.cancel();
            System.exit(0);

        }
    }
    public static void main(String[] args)
    {
        TimerTime task = new TimerTime();
        Timer timer = new Timer();
        timer.schedule(task, 0, 4000);
        System.out.println();
        System.out.println("Vous avez 10 tours!\nAppuyez sur clavier pour commencer\n");

    }
}





