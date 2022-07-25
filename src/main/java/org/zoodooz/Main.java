package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj w formie liczby dowolny dzień(1-31): ");
        int day = keyboard.nextInt();
        System.out.println("Podaj w formie liczby dowolny miesiąc(1-12): ");
        int month = keyboard.nextInt();
        System.out.println("Podaj dowolne dwie ostatnie liczby roku(01-99): ");
        int year = keyboard.nextInt();

        if (day*month == year){
            System.out.println("Podana data jest magiczna! ;) ");
        } else {
            System.out.println("Nie ma nic magicznego w tej dacie! :( ");
        }
    }
}