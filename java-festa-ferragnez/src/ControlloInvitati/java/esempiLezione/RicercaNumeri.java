package ControlloInvitati.java.esempiLezione;

import java.util.Random;
import java.util.Scanner;

public class RicercaNumeri {
    public static void main(String[] args) {
        Random generetor = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] interi = new int[15];

        for (int i = 0; i < interi.length; i++) {
            interi[i] = generetor.nextInt(25);

            // System.out.println(interi[i]);

        }

        int numerodaTrovare = 1;

        // inizializzo un funzione booleana
        boolean isFound = false;

        for (int i = 0; i < interi.length; i++) {
            int elementoCorrente = interi[i];
            System.out.println(interi[i]);
            if (elementoCorrente == numerodaTrovare) {
                isFound = true;
                break;
            }
        }
        System.out.println("verifichiamo se è uguale");
        System.out.println(isFound);

        scanner.close();
    }
}
