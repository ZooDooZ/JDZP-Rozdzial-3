package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź wybrany przez Ciebie pakiet (A, B lub C): ");
        String letter = keyboard.nextLine();
        System.out.println("Wprowadź liczbe minut rozmów: ");
        int minutes = keyboard.nextInt();

        double package1 = 39.99;
        double package2 = 59.99;
        double package3 = 69.99;


        if (letter.equalsIgnoreCase("A")){
            System.out.println("Wybrałeś pakiet A");
            if(minutes <= 450){
                System.out.println("Nie przekraczając 450 minut w miesiącu zapłacisz: " + package1);
            } else {
                System.out.println("Przekroczyłes limit! Za każda dodatkową minutę zapłacisz 0,45 zł.");
                double packageAndSurcharge = package1 + ((minutes - 450) * 0.45);
                System.out.printf("W tym miesiącu za pakiet A zapłacisz: %.2f zł", packageAndSurcharge);
            }
        }
        if (letter.equalsIgnoreCase("B")) {
            System.out.println("Wybrałeś pakiet B");
            if (minutes <= 900) {
                System.out.println("Nie przekraczając 900 minut w miesiącu zapłacisz: " + package2);
            } else {
                System.out.println("Przekroczyłes limit! Za każda dodatkową minutę zapłacisz 0,40 zł.");
                double packageAndSurcharge = package2 + ((minutes - 900) * 0.40);
                System.out.printf("W tym miesiącu za pakiet B zapłacisz: %.2f zł", packageAndSurcharge);
            }
        }
        if (letter.equalsIgnoreCase("C")) {
            System.out.println("Wybrałeś pakiet C");
            System.out.println("Za pakiet zapłacisz zawsze: " + package3 + " zł bez względu na wykorzystane minuty.");
        }
    }
}