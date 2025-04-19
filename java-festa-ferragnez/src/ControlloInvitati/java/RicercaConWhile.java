package ControlloInvitati.java;

import java.util.Random;
import java.util.Scanner;

public class RicercaConWhile {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);

        int [] interi = new int[15];

        
        for (int i = 0; i < interi.length ; i++){
            interi[i] = generator.nextInt(12); //genera numeri


            int numeroDaCercare = 1;
            int index = 0;
            boolean trovato = false;
            while (trovato == false && index < interi.length){
                if (interi[index] == numeroDaCercare) {
                    trovato = true;
                }
                System.out.println(interi[index]);
                index++;
            }
            scanner.close();


            System.out.println("L'elemento e' presente oppure no? ");
            System.out.println(trovato);

       
    }
    
    } 
}
