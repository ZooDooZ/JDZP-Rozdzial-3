package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę zakupionych pakietów: ");
        int packages = keyboard.nextInt();

        if (packages >= 10 && packages <=19){
            System.out.println("Przynany rabat - 20%");
            double discount = (packages * 99) * 0.2;
            double price = (packages * 99) - discount;
            System.out.println("Za swoje pakiety zapłacisz: " + price + " zł.");
        } else if (packages >= 20 && packages <=49){
            System.out.println("Przynany rabat - 30%");
            double discount = (packages * 99) * 0.3;
            double price = (packages * 99) - discount;
            System.out.println("Za swoje pakiety zapłacisz: " + price + " zł.");
        } else if (packages >= 50 && packages <=99){
            System.out.println("Przynany rabat - 40%");
            double discount = (packages * 99) * 0.4;
            double price = (packages * 99) - discount;
            System.out.println("Za swoje pakiety zapłacisz: " + price + " zł.");
        } else if (packages >= 100) {
            System.out.println("Przynany rabat - 50%");
            double discount = (packages * 99) * 0.5;
            double price = (packages * 99) - discount;
            System.out.println("Za swoje pakiety zapłacisz: " + price + " zł.");
        } else {
            System.out.println("Nie przyznano żadnego rabatu.");
            double price = (packages * 99);
            System.out.println("Za swoje pakiety zapłacisz: " + price + " zł.");
        }
    }
}