package ControlloInvitati.java.esempiLezione;

import java.util.Scanner;

public class VerificaParola {
    public static void main(String[] args) {
        //proviamoesercizio



        Scanner scanner = new Scanner (System.in);


        System.out.println("scrivi una parola");
        String firstWord = scanner.nextLine();

        System.out.println("scrivine un altra");
        String secondWord = scanner.nextLine();

        scanner.close();


        if ( firstWord.length() > secondWord.length()){
            System.out.println("La prima parola è la più lunga");

        } else if ( firstWord.length() < secondWord.length()) {

            System.out.println("La seconda parola è la più grande");
        } else {
            System.out.println("condividopno la stessa lunghezza");
        }
        
    }
}

