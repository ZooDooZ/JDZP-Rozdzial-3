package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę zakupionych książek w danym miesiącu: ");
        int numberOfBooks =  keyboard.nextInt();

        switch (numberOfBooks) {
            case 0:
                System.out.println("Otrzymujesz 0 pkt.");
                break;
            case 1:
                System.out.println("Otrzymujesz 5 pktów.");
                break;
            case 2:
                System.out.println("Otrzymujesz 15 pktów.");
                break;
            case 3:
                System.out.println("Otrzymujesz 30 pktów.");
                break;
            case 4:
                System.out.println("Otrzymujesz 60 pktów.");
                break;
            default:
                System.out.println("Otrzymujesz 60 pktów");
        }

    }
}