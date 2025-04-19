package ControlloInvitati;

import java.util.Scanner;


public class ListaIvitatiFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String [] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

System.out.println("Mi dica il suo nome, verifico se è presente nella lista");
String nomeDaVerificare = scanner.nextLine();

boolean nomeInserito = false;




        for (int i = 0; i < listaInvitati.length ; i++){
          if (nomeDaVerificare.equalsIgnoreCase(listaInvitati[i])){  
            nomeInserito = true;
          }

}


// ora stampo nel terminale..
if (!nomeInserito) {
  System.out.println("Non puoi entrare, non penso proprio!!");
}
else {
  System.out.println("Mi scusi, entri pure!!");
}


      scanner.close();
    }
    
}
