package ControlloInvitati;

import java.util.Scanner;

public class ListaInvitatiWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lista invitati
        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.println("Inserisci il tuo nome");
        String nomeDaVerificare = scanner.nextLine();

        boolean nomeInserito = false;
        int i = 0;

        while (i < listaInvitati.length) {
 
            if (nomeDaVerificare.equalsIgnoreCase(listaInvitati[i])) {
                nomeInserito = true;
                break;
            }
            i++;

        }


        if (!nomeInserito) {
            System.out.println("Mi dispiace, ma il suo nome non è presente nella lista");
            
        }
        else {
            System.out.println("Benvenuto, si godi la festa!");
        }

        scanner.close();
    }

}
