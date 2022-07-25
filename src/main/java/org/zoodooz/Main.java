package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź wagę przesyłki(kg): ");
        double weigh = keyboard.nextDouble();
        System.out.println("Wprowadź odległość przesyłki(km): ");
        double distance = keyboard.nextDouble();

        if (weigh <= 1 && weigh > 0){
            double pricePerKm = 1.1/500;
            double finalPrice = distance * pricePerKm;
            System.out.println("Za przesłanie swojej paczki zapłacisz: " + finalPrice + " zł.");
        } else if (weigh > 1 && weigh <= 3){
            double pricePerKm = 2.2/500;
            double finalPrice = distance * pricePerKm;
            System.out.println("Za przesłanie swojej paczki zapłacisz: " + finalPrice + " zł.");
        } else if(weigh > 3 && weigh <=5){
            double pricePerKm = 3.7/500;
            double finalPrice = distance * pricePerKm;
            System.out.println("Za przesłanie swojej paczki zapłacisz: " + finalPrice + " zł.");
        } else if (weigh > 5){
            double pricePerKm = 3.8/500;
            double finalPrice = distance * pricePerKm;
            System.out.println("Za przesłanie swojej paczki zapłacisz: " + finalPrice + " zł.");
        }else {
            System.out.println("Wprowadź wagę i dystans jeszcze raz.");
        }
    }
}