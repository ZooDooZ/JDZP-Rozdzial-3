package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Uruchom ponownie komputer i spróbuj nawiązać połączenie.");

        System.out.println("Czy to rozwiązało problem (Tak/Nie)?");
        String answer1 = keyboard.nextLine();

        if(answer1.equalsIgnoreCase("Nie")){
            Scanner keyboard1 = new Scanner(System.in);
            System.out.println("Uruchom ponownie router i spróbuj nawiązać połączenie.");
            System.out.println("Czy to rozwiązało problem?");
            String answer2 = keyboard.nextLine();
            if(answer2.equalsIgnoreCase("nie")){
                System.out.println("Upewnij się, że kable prowadzące do routera i modemu są dobrze zamocowane.");
                System.out.println("Czy to rozwiązało problem?");
                String answer3 = keyboard.nextLine();
                if(answer3.equalsIgnoreCase("nie")){
                    System.out.println("Przenieś router w inne miejsce.");
                    System.out.println("Czy to rozwiązało problem?");
                    String answer4 = keyboard.nextLine();
                    if (answer4.equalsIgnoreCase("nie")){
                        System.out.println("Kup nowy router!");
                    } else {
                        System.out.println("Wystarczyło przenieść router w inne miejsce");
                    }
                } else{
                    System.out.println("Wystarczyło sprawdzić kable prowadzące do routera i modemu czy są dobrze zamocowane.");
                }
            } else {
                System.out.println("Wystarczyło ponownie uruchomić router.");
            }
        } else {
            System.out.println("Wystarczyło ponownie uruchomić komputer");
        }
    }
}