package org.ieslosremedios.daw1.prog.ut4.arrays.Act43OperacionesConArrays;

import java.util.Arrays;
import java.util.Random;

public class Act43OperacionesConArrays {
    public static void main(String[] args) {
        //apartado 1, metodo listado abajo
        int[] array10random = arrayAleatorio(10);
        System.out.println(Arrays.toString(array10random));
        //apartado 2, metodo listado abajo
        arrayAleatorioAlReves(array10random);
        //apartado 3, metodo listado abajo
        ordenarArray(array10random);
        System.out.println(Arrays.toString(array10random));
        //apartado 4, metodos listados abajo
        System.out.println(buscarEnArray(array10random, 17));
        System.out.println(buscarConBinarySearch(array10random, 17));
        //apartado 5, metodo listado abajo
        //ambos arrays contendran 10 ceros, por lo que siempre devolvera true hasta que cambien
        int[] arraycomparar = new int[10];
        int[] arraycomparar2 = new int[10];

        compararArrays(arraycomparar, arraycomparar2);
        //apartado 6, metodos listados abajo
        int[][] copiaDeArray = new int [4][0];
        //usamos los metodos para clonar el array a las nuevas posiciones del array creado de 4 posiciones (CopiaDeArray)
        metodoClone(copiaDeArray,array10random);
        metodoCopyOf(copiaDeArray,array10random);
        metodoCopyOfRange(copiaDeArray,array10random);
        metodosystemArrayCopy(copiaDeArray,array10random);
        //A continuacion imprimimos las referencias de cada Array dentro del array creado y sus 4 posiciones
        System.out.println(Arrays.toString(copiaDeArray));

        System.out.println(Arrays.toString(copiaDeArray[0]));
        System.out.println(Arrays.toString(copiaDeArray[1]));
        System.out.println(Arrays.toString(copiaDeArray[2]));
        System.out.println(Arrays.toString(copiaDeArray[3]));
    }

    //1 Creacion de array con numeros aleatorios (ayudandonos del metodo random de la clase java.util)
    private static int[] arrayAleatorio(int capacidad) {
        Random numerorandom = new Random();
        int[] arrayrandom = new int[capacidad];
        for (int i = 0; i < arrayrandom.length; i++) {
            arrayrandom[i] = numerorandom.nextInt(100);
        }
        return arrayrandom;
    }

    //2 Creamos un metodo que pueda invertir las posiciones de un array dado, esto se consigue invirtiendo los valores del comienzo y finalización respecto
    //a los del metodo anterior
    private static void arrayAleatorioAlReves(int[] arrayderecho) {
        System.out.print("[");
        for (int i = arrayderecho.length - 1; i >= 0; i--) {
            System.out.print(arrayderecho[i] + ", ");
        }
        System.out.println("]");
    }

    //3 Usamos la clase sort de Arrays para ordenar un array dado
    private static int[] ordenarArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    //4 Creamos un metodo para buscar un elemento en un array y otro metodo que use el metodo de Arrays llamado binarysearch
    private static String buscarEnArray(int[] q, int z) {
        for (int i = 0; i < q.length; i++) {
            if (q[i] == z)
                return "El numero buscado manualmente esta en la posicion " + i;
        }
        return "No se ha encontrado el numero";
    }

    private static String buscarConBinarySearch(int[] q, int z) {
        return "El numero buscado esta en la posicion " + Arrays.binarySearch(q, z);
    }

    //5 Metodo para comparar arrays usando el metodo equals de Arrays
    private static void compararArrays(int[] a, int[] b) {
        System.out.println(Arrays.equals(a, b));
    }

    //6 Metodos necesarios para las 4 copias
    private static void metodoClone(int[][] array1, int[] arrayACopiar) {
        array1[0] = arrayACopiar.clone();
    }

    private static void metodoCopyOf(int[][] array1, int[] arrayACopiar) {
        array1[1] = Arrays.copyOf(arrayACopiar, 4);
    }

    private static void metodoCopyOfRange(int[][] array1, int[] arrayACopiar) {
        array1[2] = Arrays.copyOfRange(arrayACopiar, 0, 4);
    }
    private static void metodosystemArrayCopy(int[][] array1, int[] arrayACopiar) {
        int[] arrayIntermedio = new int[10];
        System.arraycopy(arrayACopiar,0,arrayIntermedio,0,arrayACopiar.length);
        array1[3]=arrayIntermedio;
    }


}