package org.ieslosremedios.daw1.prog.ut4.arrays;

public class Act42OperacionesConArrays {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        //Ambas variables empiezan desde el 1 debido a las especificaciones del ejercicio (se excluyen las multiplicaciones con 0s)
        for (int i = 1; i <= Array1.length; i++) {
            for (int j = 1; j <= Array1.length; j++) {
                System.out.println("[" + i + "," + j + "," + (i * j) + "]");
            }

        }
    }
}