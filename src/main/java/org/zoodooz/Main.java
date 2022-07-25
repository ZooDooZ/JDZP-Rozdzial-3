package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wpisz liczbę czeków wystawioną w tym miesiącu: ");
        int numberOfCheck = keyboard.nextInt();

        if(numberOfCheck < 20 && numberOfCheck > 0){
            double monthPrice = numberOfCheck * 0.1 + 10;
            System.out.println("W tym miesiącu opłaty bankowe wynoszą: " + monthPrice + " zł.");
        } else if (numberOfCheck >= 20 && numberOfCheck <=39) {
            double monthPrice = numberOfCheck * 0.08 + 10;
            System.out.println("W tym miesiącu opłaty bankowe wynoszą: " + monthPrice + " zł.");
        } else if (numberOfCheck >= 40 && numberOfCheck <=59) {
            double monthPrice = numberOfCheck * 0.06 + 10;
            System.out.println("W tym miesiącu opłaty bankowe wynoszą: " + monthPrice + " zł.");
        } else if (numberOfCheck > 60) {
            double monthPrice = numberOfCheck * 0.04 + 10;
            System.out.println("W tym miesiącu opłaty bankowe wynoszą: " + monthPrice + " zł.");
        } else {
            System.out.println("Błędnie wprowadzone dane!");
        }
    }
}