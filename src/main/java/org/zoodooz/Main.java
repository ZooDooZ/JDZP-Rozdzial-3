package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę kalorii w produkcie żywnościowym: ");
        double numberKcal = keyboard.nextDouble();
        System.out.println("Wprowadź liczbę gramów tłuszczu w produkcie żywnościowym: ");
        double numberFat = keyboard.nextDouble();

        double kcalFromFat = numberFat * 9;

        double percentOfFat = (kcalFromFat/numberKcal) * 100;

        if (numberKcal > kcalFromFat){
            System.out.printf("Procent kalori pochodzący z tłuszczu: %.1f", percentOfFat);
            System.out.println();
        } else {
            System.out.println("Błąd! Dane wejściowe są nieprawidłowe!");
        }

        if (percentOfFat < 30){
            System.out.println("Produkt jest niskotłuszczowy bo zawiera mniej niż 30% całkowitej liczby kcal.");
        }
    }
}