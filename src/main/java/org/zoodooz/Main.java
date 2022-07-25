package org.zoodooz;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String massObject = JOptionPane.showInputDialog("Prosze podac mase obiektu: ");
        double massObjectD = Double.parseDouble(massObject);

        double weigh = massObjectD * 9.8;

        if (weigh > 1000){
            System.out.println("Obiekt jest zbyt ciężki, przekracza 1000 niutonów i dokładnie wynosi: " + weigh);
        } else if(weigh < 10){
            System.out.println("Obiekt jest zbyt lekki, jest poniżej 10 niutonów i dokładnie wynosi: " + weigh);
        } else {
            System.out.println("Odpowiedni zakres ciężaru obiektu.");
        }
    }
}