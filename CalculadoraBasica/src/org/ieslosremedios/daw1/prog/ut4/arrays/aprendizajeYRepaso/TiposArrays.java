package org.ieslosremedios.daw1.prog.ut4.arrays.aprendizajeYRepaso;

public class TiposArrays {
    public static void main(String[] args) {
        int[][] enteros = new int[5][2];
        enteros[0][0] = 1;
        enteros[0][1] = 2;
        //Con corchete
        int[][] enteros2 = {{1,2},{3,4},{5,6}};
        System.out.println(enteros.length);
        System.out.println(enteros[0].length);
        //Sin corchete
        int [][] enteros3 = {{0},{0,1},{0,1,2}};
        System.out.println(enteros3[0].length);
        System.out.println(enteros3[1].length);
        System.out.println(enteros3[2].length);
    }
}