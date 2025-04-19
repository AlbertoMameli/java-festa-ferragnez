package ControlloInvitati.java.esempiLezione;

public class CicloFor {
    public static void main(String[] args) {
        int [] interi = {1, 2, 3, 4, 5};
      
        interi[4] = 132;
     
        for (int i = 0; i < interi.length ; i++){
            System.out.println("Alli'indice " + i + " si trova l'elemento " + interi[i]);

        }
    }
}
