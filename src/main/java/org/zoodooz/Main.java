package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj losowe pierwsze imię: ");
        String name1 = keyboard.nextLine();
        System.out.println("Podaj losowe drugie imię: ");
        String name2 = keyboard.nextLine();
        System.out.println("Podaj losowe trzecie imię: ");
        String name3 = keyboard.nextLine();

        if (name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0 && name2.compareToIgnoreCase(name3) < 0) {
            System.out.println(name1 +"\n" + name2 + "\n" + name3);
        } else if (name2.compareToIgnoreCase(name1) < 0 && name2.compareToIgnoreCase(name3) < 0 && name1.compareToIgnoreCase(name3) < 0) {
            System.out.println(name2 +"\n" + name1 + "\n" + name3);
        } else if (name3.compareToIgnoreCase(name1) < 0 && name3.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name2) < 0) {
            System.out.println(name3 + "\n" + name1 + "\n" + name2);
        } else {
            System.out.println("Coś zrąbałeś");
        }
    }
}