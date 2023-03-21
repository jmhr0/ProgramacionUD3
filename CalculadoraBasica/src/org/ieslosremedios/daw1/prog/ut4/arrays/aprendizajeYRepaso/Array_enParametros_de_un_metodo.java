package org.ieslosremedios.daw1.prog.ut4.arrays.aprendizajeYRepaso;

public class Array_enParametros_de_un_metodo {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String z = "hola";


        Double[] arrayDeEntrada = {1d, 2d, 3d};

        int [][] datosRetorno = metodo (x,y,z, arrayDeEntrada);

        System.out.println(metodo(x,y,z,arrayDeEntrada));
    }
    static int[][] metodo(int x, int y, String z, Double[] arrayDeEntrada){
        x=3;
        return new int [2][2];
    }
}