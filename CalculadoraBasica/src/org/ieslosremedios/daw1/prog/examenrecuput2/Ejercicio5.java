package org.ieslosremedios.daw1.prog.examenrecuput2;

public class Ejercicio5 {

    public static final int NIVEL = 10;

    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < NIVEL; i++) {
            for (int j = 0; j < NIVEL - i; j++)
                System.out.print(" ");
            for (k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        int Tronco = Math.round(k / 2f);
        int Troncod = Tronco - 1;
        int Troncof = k - Tronco + 1;
        for (int i = 1; i <= NIVEL - 1; i++) {
            System.out.print(" ");
            int j = 1;
            for (j = 1; j < k; j++) {
                if (j == Troncod || j == Troncof) {
                    System.out.print("|");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}