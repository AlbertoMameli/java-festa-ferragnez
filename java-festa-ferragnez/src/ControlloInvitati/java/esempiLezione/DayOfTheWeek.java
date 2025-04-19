package ControlloInvitati.java.esempiLezione;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero fino a 10");
        int day = scanner.nextInt();
        String dayName;



        // proviamo lo switch


        switch (day){
            case 1:
            dayName = "lunedi";
            break;
            case 2:
            dayName = "martedi";
            break;
            case 3:
            dayName = "mercoledi";
            break;
            case 4:
            dayName = "giovedi";
            break;
            case 5:
            dayName = "venerdii";
            break;
            case 6:
            dayName = "sabato";
            break;
            case 7:
            dayName = "domenica";
            break;
            default:
            dayName = "Non trovato";

        }
        System.out.println(dayName);

scanner.close();
    }
    
}
