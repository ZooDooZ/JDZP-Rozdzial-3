package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Proszę o wprowadzenie liczby sekund: ");
        int seconds = keyboard.nextInt();

        if (seconds < 60){
            System.out.println(seconds + " sek.");
        } else if (seconds >= 60 && seconds < 3600){
            int minutes = seconds / 60;
            System.out.println(minutes + " min.");
        } else if (seconds >= 3600 && seconds < 86400){
            int hours = seconds / 3600;
            System.out.println(hours + " godz.");
        } else if (seconds >=86400){
            int days = seconds / 86400;
            System.out.println(days + " dni");
        } else {
            System.out.println("Błąd wprowadzania sekund!");
        }
    }
}