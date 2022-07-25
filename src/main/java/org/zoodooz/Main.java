package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj swoje nazwisko: ");
        String surnamePlayer1 = keyboard.nextLine();
        System.out.println("Podaj czas ukończenia biegu(min): ");
        int timePlayer1 = keyboard.nextInt();

        System.out.println("Podaj swoje nazwisko: ");
        keyboard.nextLine();
        String surnamePlayer2 = keyboard.nextLine();
        System.out.println("Podaj czas ukończenia biegu(min): ");
        int timePlayer2 = keyboard.nextInt();

        System.out.println("Podaj swoje nazwisko: ");
        keyboard.nextLine();
        String surnamePlayer3 = keyboard.nextLine();
        System.out.println("Podaj czas ukończenia biegu(min): ");
        int timePlayer3 = keyboard.nextInt();

        if (timePlayer1 < timePlayer2 && timePlayer2 < timePlayer3) {
            System.out.println(surnamePlayer1 + "\n" + surnamePlayer2 + "\n" + surnamePlayer3);
        } else if (timePlayer2 < timePlayer3 && timePlayer1 < timePlayer3) {
            System.out.println(surnamePlayer2 + "\n" + surnamePlayer1 + "\n" + surnamePlayer3);
        } else if (timePlayer3 < timePlayer1 && timePlayer2 < timePlayer1) {
            System.out.println(surnamePlayer3 + "\n" + surnamePlayer2 + "\n" + surnamePlayer1);
        } else if (timePlayer3 < timePlayer1 && timePlayer1 < timePlayer2) {
            System.out.println(surnamePlayer3 + "\n" + surnamePlayer1 + "\n" + surnamePlayer2);
        } else if (timePlayer1 < timePlayer3 && timePlayer3 < timePlayer2) {
            System.out.println(surnamePlayer1 + "\n" + surnamePlayer3 + "\n" + surnamePlayer2);
        } else if (timePlayer3 < timePlayer2 && timePlayer1 < timePlayer2) {
            System.out.println(surnamePlayer2 + "\n" + surnamePlayer3 + "\n" + surnamePlayer1);
        } else {
            System.out.println("COŚ ZRĄBALEŚ! :D ");
        }
    }
}