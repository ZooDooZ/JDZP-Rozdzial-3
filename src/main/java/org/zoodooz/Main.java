package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź wynik z pierwszego test: ");
        int test1 = keyboard.nextInt();
        if (test1 < 0 || test1 > 100){
            System.out.println("Podałeś zły wynik!");
        }
        System.exit(0);

        System.out.println("Wprowadź wynik z drugiego test: ");
        int test2 = keyboard.nextInt();


        System.out.println("Wprowadź wynik z trzeciego test: ");
        int test3 = keyboard.nextInt();

        double avgGrades = (test1 + test2 + test3) / 3;

        if(avgGrades >= 90 && avgGrades <= 100){
            System.out.println("Twoja średnia z trzech testów to: " + avgGrades);
            System.out.println("Twoja ocena to: 5");
        } else if (avgGrades >= 80 && avgGrades <= 89) {
            System.out.println("Twoja średnia z trzech testów to: " + avgGrades);
            System.out.println("Twoja ocena to: 4");
        } else if (avgGrades >= 70 && avgGrades <= 79) {
            System.out.println("Twoja średnia z trzech testów to: " + avgGrades);
            System.out.println("Twoja ocena to: 3");
        } else if (avgGrades >= 60 && avgGrades <= 69) {
            System.out.println("Twoja średnia z trzech testów to: " + avgGrades);
            System.out.println("Twoja ocena to: 2");
        } else if (avgGrades < 60) {
            System.out.println("Twoja średnia z trzech testów to: " + avgGrades);
            System.out.println("Twoja ocena to: 1");
        } else {
            System.out.println("Błędny wynik!");
        }
    }
}