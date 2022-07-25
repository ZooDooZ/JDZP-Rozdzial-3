package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej? (tak/nie): ");
        String answerVegetarian = keyboard.nextLine();

        System.out.println("Czy któraś z osób jest na diecie wegańskiej? (tak/nie): ");
        String answerVegan = keyboard.nextLine();

        System.out.println("Czy któraś z osób jest na diecie bezglutenowej? (tak/nie): ");
        String answerGluten = keyboard.nextLine();

        System.out.println("Możecie wybrać sie do następujących restauracji: ");

        if (answerVegetarian.equalsIgnoreCase("tak") && answerVegan.equalsIgnoreCase("tak")
                && answerGluten.equalsIgnoreCase("tak")) {
            System.out.println("Kawiarnia na Rogu,\nKuchnia u Szefa.");
        } else if (answerVegetarian.equalsIgnoreCase("nie") && answerVegan.equalsIgnoreCase("nie")
                && answerGluten.equalsIgnoreCase("nie")) {
            System.out.println("Luksusowe Burgery u Jarka.");
        } else if (answerVegetarian.equalsIgnoreCase("tak") && answerVegan.equalsIgnoreCase("nie")
                && answerGluten.equalsIgnoreCase("tak")) {
            System.out.println("Pizzeria przy Dworcowej,\nKawiarnia na Rogu,\nKuchnia u Szefa.");
        } else if (answerVegetarian.equalsIgnoreCase("nie") && answerVegan.equalsIgnoreCase("tak")
                && answerGluten.equalsIgnoreCase("nie")) {
            System.out.println("Kawiarnia na Rogu,\nKuchnia u Szefa.");
        } else if (answerVegetarian.equalsIgnoreCase("nie") && answerVegan.equalsIgnoreCase("tak")
                && answerGluten.equalsIgnoreCase("tak")) {
            System.out.println("Kawiarnia na Rogu,\nKuchnia u Szefa.");
        } else if (answerVegetarian.equalsIgnoreCase("tak") && answerVegan.equalsIgnoreCase("nie")
                && answerGluten.equalsIgnoreCase("nie")) {
            System.out.println("Pizzeria przy Dworcowej,\nKawiarnia na Rogu,\nWłoskie Specjały,\nKuchnia u Szefa.");
        }else if (answerVegetarian.equalsIgnoreCase("tak") && answerVegan.equalsIgnoreCase("tak")
                && answerGluten.equalsIgnoreCase("nie")) {
            System.out.println("Kawiarnia na Rogu,\nKuchnia u Szefa,\nKuchnia u Szefa.");
        } else if (answerVegetarian.equalsIgnoreCase("nie") && answerVegan.equalsIgnoreCase("nie")
                && answerGluten.equalsIgnoreCase("tak")) {
            System.out.println("Pizzeria przy Dworcowej,\nKawiarnia na Rogu.");
        } else {
            System.out.println("WYPAD JEŚĆ GDZIE INDZIEJ!!!");
        }
    }
}