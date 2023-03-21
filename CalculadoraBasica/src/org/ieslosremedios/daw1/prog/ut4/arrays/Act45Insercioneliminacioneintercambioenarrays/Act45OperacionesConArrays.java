package org.ieslosremedios.daw1.prog.ut4.arrays.Act45Insercioneliminacioneintercambioenarrays;

import java.util.Arrays;

public class Act45OperacionesConArrays {

    public static void main(String[] args) {
        System.out.println("ap1: ");

        int[] arrayAInsertar1 = {0, 1, 2, 3};

        System.out.println(Arrays.toString(insertarElemento(arrayAInsertar1,25,4)));

        int[] arrayAInsertar2 = {4, 5 ,6 ,7};

        System.out.println(Arrays.toString(insertarElemento(arrayAInsertar1,arrayAInsertar2,4)));

        System.out.println("ap2: "); //problemas con borrado fisico
        int [] arrayParaEliminar = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(eliminarElementoArray(arrayParaEliminar,4,true)));
        System.out.println(Arrays.toString(eliminarElementoArray(arrayParaEliminar,4,false)));

        System.out.println("ap3: ");
        int[] arrayParaCambiarParEImpares = {5,6,7,8,9,10};
        System.out.println(Arrays.toString(cambiarParPorImpar(arrayParaCambiarParEImpares)));

    }

    // A continuación de la actividad A4.3. continúa creando los siguientes métodos:
    // Un método que recibe un array de enteros, un elemento entero y una posición. Devuelve otro array que será
    // una copia del array de entrada pero insertando un nuevo elemento (el indicado en los parámetros) en la
    // posición indicada.

    private static int[] insertarElemento(int[] array, int numInsertar, int pos) {
        int[] out = new int[array.length + 1];

        for (int i = 0; i < pos; i++) {
            out[i] = array[i];
        }
        out[pos] = numInsertar;

        for (int i = pos + 1; i < out.length; i++) {
            out[i] = array[i - 1];
        }
        return out;
    }

    // Ahora sobrecarga el método para que reciba en lugar de un elemento entero un elemento que
    // sea otro array de enteros. Habrá que insertar los elementos de este array empezando desde la posición.

    private static int[] insertarElemento(int[] array, int[] arrayAInsertar, int pos) {
        int[] NuevoDobleArray = new int[array.length + arrayAInsertar.length];

        for (int i = 0; i < pos; i++) {
            NuevoDobleArray[i] = array[i];
        }
        for (int i = 0; i < arrayAInsertar.length; i++ ){
            NuevoDobleArray[pos + i] = arrayAInsertar[i];
        }
        for (int i = pos + arrayAInsertar.length; i < NuevoDobleArray.length; i++) {
            NuevoDobleArray[i] = array[i - arrayAInsertar.length];
        }
        return NuevoDobleArray;
    }

    // 2.- Un método que recibe un array de enteros, un elemento entero y un booleano. Devuelve un nuevo array que será
    // una copia del array de entrada pero eliminado el elemento si existe. Para ello deberá de buscarlo previamente.
    // La eliminación podrá ser lógica o física, esto es, si el booleano es true, se hará el borrado lógico, con lo que se
    // pondrá el valor del elemento en el array a 0, mientras que si el booleano es false, se hará borrado físico,
    // eliminado el elemento del array quedando el array con una posición menos.

    static int[] eliminarElementoArray(int[] array,int aborrar, boolean borrado){
        if (borrado == true){
            for (int i = 0; i < array.length; i++){
                if (array[i] == aborrar){
                    array[i] = 0;

                }
            }
            return array;
        } else if (borrado==false){
            int[]copiaOriginal=new int[array.length-1];
            int posicion=0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]==aborrar){
                    posicion=i;
                    break;
                }
            }
            System.arraycopy(array,0,copiaOriginal,0,posicion);
            System.arraycopy(array,posicion+1,copiaOriginal,posicion,(array.length-posicion-1));
            return copiaOriginal;
        }

        return array;
    }
    //3.- Un método que reciba un array de enteros como parámetro de entrada y salida, de modo que intercambie todas
    // las posiciones pares por las impares.

    static int[] cambiarParPorImpar(int[] array){
        for(int i = 0; i<array.length; i++){
            if(i%2 == 0 && i+1 < array.length){
                int posicionAIntercambiar = array[i];
                array[i] = array[i+1];
                array[i+1] = posicionAIntercambiar;
            }
        }
        return array;
    }
}