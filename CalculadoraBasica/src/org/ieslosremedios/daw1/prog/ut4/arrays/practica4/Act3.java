package org.ieslosremedios.daw1.prog.ut4.arrays.practica4;

import java.util.Arrays;
import java.util.Random;

public class Act3 {
    public static void main(String[] args) {
        //Usamos el metodo creado abajo para crear un array unidimensional con numeros aleatorios
        int[] array1 = GeneracionArrayAleatorio(100);
        //Imprimimos por pantalla el array previamente creado
        System.out.println(Arrays.toString(array1));
        //Usamos el metodo conocerMayor creado abajo para obtener el mayor numero creado de manera aleatoria en el array especificado
        System.out.println(conocerMayor(array1));
        //Usamos el metodo conocerMenor creado abajo para obtener el menor numero creado de manera aleatoria en el array especificado
        System.out.println(conocerMenor(array1));
        //Usamos el metodo obtenerSuma creado abajo para obtener la suma de todos los numeros aleatorios creados en el array especificado
        System.out.println(obtenerSuma(array1));
        //Usamos el metodo obtenerMedia creado abajo para obtener la media de todos los numeros aleatorios creados en el array especificado
        System.out.println(obtenerMedia(array1));
        //Usamos el metodo sustituirNums creado abajo para sustituir el numero dado (95) en la posicion que especifiquemos (13) en el array dado (array1)
        cambiarValor(array1,95,13);
        //Finalmente imprimimos el array final para asegurar que en la posicion especificado hemos intercambiado el numero por el dado
        //El array se encuentra ordenador de menor a mayor por el uso de otros metodos anteriores
        System.out.println(Arrays.toString(array1));
    }

    //Generacion de un array aleatorio
    private static int[] GeneracionArrayAleatorio(int longitud) {
        Random numerorandom = new Random();
        int[] arrayrandom = new int[longitud];
        for (int i = 0; i < 100 ; i++) {
            arrayrandom[i] = numerorandom.nextInt(100);
        }
        return arrayrandom;
    }

    private static int conocerMayor(int[] a) {
        int contador=0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i]>contador);
            contador=a[i];
        }return contador;
    }

    private static int conocerMenor(int[] a) {
        int contador= 100;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++){
            if (a[i] < contador ){
                contador = a[i];
            }
        }
        return contador;
    }
    private static int obtenerSuma(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            contador=contador+a[i];
        }
        return contador;
    }
    private static int obtenerMedia(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            contador=contador+a[i];
        }
        int media = (contador/100);
        return media;
    }
    private static void cambiarValor (int [] a, int pos, int numdado){
        a[pos] = numdado;
        System.out.println("La posición " + pos + " ahora tiene el valor de: " + a[pos]);
    }
}
