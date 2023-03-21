package org.ieslosremedios.daw1.prog.ut4.arrays.Act42OperacionesConArrays;

import java.util.Arrays;

public class Act42OperacionesConArrays {
    public static void main(String[] args) {
        //creacion de un array para guardar todos los valores de las tablas de multiplicar
        int[][][] tablasmult = new int[10][10][3];
        //bucle para imprimir todas las tablas de multiplicar hasta el 10
        for(int i = 1; i <= 10; i++) {
            tablasmult[i - 1] = multiplicarTablas(i);
        }

        impresionTablas(tablasmult);
    }
    //multiplicacion de cada tabla de manera individual
    private static int[][] multiplicarTablas(int numero) {

        int[][] tablaMult = new int[10][3];

        for(int i = 0; i < tablaMult.length; i++) {
            tablaMult[i][0] = numero;
            tablaMult[i][1] = i + 1;
            tablaMult[i][2] = numero * tablaMult[i][1];
        }

        return tablaMult;
    }

    private static void impresionTablas (int[][][] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                //imprime las tablas añadiendo un espacio entre ellas
                System.out.print(Arrays.toString(tabla[i][j]) + "\t");
            }
            //aporta formato
            System.out.println();
        }
    }
}
