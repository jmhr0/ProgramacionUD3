package org.ieslosremedios.daw1.prog.ut4.arrays.practica4;

import java.util.Arrays;
import java.util.Random;

public class Act3 {
    public static void main(String[] args) {
        //Usamos el metodo creado abajo para crear un array unidimensional con numeros aleatorios
        int[] array1 = GeneracionArrayAleatorio();
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
        sustituirNums(array1,95,13);
        //Finalmente imprimimos el array final para asegurar que en la posicion especificado hemos intercambiado el numero por el dado
        //El array se encuentra ordenador de menor a mayor por el uso de otros metodos anteriores
        System.out.println(Arrays.toString(array1));
    }

    //Generacion de un array aleatorio, esto se consigue creando una variable usando el tipo
    private static int[] GeneracionArrayAleatorio() {
        //TODO usar la funcion math.random en vez del tipo random
        Random numerorandom = new Random();
        int[] arrayrandom = new int[100];
        for (int i = 0; i < arrayrandom.length; i++) {
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
        for (int i = a.length-1; i >0; i--) {
            if (a[i]<contador);
            contador=a[i];
        }return contador;
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

        contador= contador/a.length-1;
        }//TODO reflexionar sobre el -1
        return contador;
    }
    private static int [] sustituirNums(int[] a, int numdado, int numpos) {
        a[numpos]=numdado;
        return a;
    }
}
