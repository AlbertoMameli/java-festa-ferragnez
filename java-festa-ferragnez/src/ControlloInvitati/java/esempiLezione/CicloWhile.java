package ControlloInvitati.java.esempiLezione;

public class CicloWhile {
    public static void main(String[] args) {
        int [] interi = {1, 2, 3, 4, 5};

        int i = 0;
        while (i< interi.length && true ) {
            System.out.println(interi[i]);
            i++;
        }
    }
}
