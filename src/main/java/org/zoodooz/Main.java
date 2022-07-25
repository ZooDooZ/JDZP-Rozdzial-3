package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj swoją wagę (kg): ");
        double weigh = keyboard.nextDouble();
        System.out.println("Podaj swój wzrost (m, np: 1,81): ");
        double height = keyboard.nextDouble();

        double bmi = weigh / (height * height);

        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Masz optymalną wagę");
            System.out.println("Twój BMI to: " + bmi);
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę!");
            System.out.println("Twój BMI to: " + bmi);
        } else if (bmi > 25) {
            System.out.println("Masz nadwage!");
            System.out.println("Twój BMI to: " + bmi);
        } else {
            System.out.println("Błąd");
        }
    }
}