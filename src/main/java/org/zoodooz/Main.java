package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź słowo - powietrze, woda lub stal: ");
        String scannerWord = keyboard.nextLine();
        System.out.println("Wprowadź odgległość jaką fala dźwiękowa ma przebyć w wybranym nośniku(m): ");
        double distance = keyboard.nextDouble();

        if (scannerWord.equalsIgnoreCase("Powietrze")){
            double time = distance / 343;
            System.out.printf("Czas w jakim dźwięk w podanej odległość pokona w powietrzu : %.2f sekund " + time);
        } else if (scannerWord.equalsIgnoreCase("Woda")) {
            double time = distance / 1490;
            System.out.printf("Czas w jakim dźwięk w podanej odległość pokona w wodzie : %.2f sekund ", time);
        } else if (scannerWord.equalsIgnoreCase("Stal")) {
            double time = distance / 5100;
            System.out.printf("Czas w jakim dźwięk w podanej odległość pokona w stali : %.2f sekund " + time);
        }
    }
}