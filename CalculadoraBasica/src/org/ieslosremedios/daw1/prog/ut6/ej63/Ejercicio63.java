package org.ieslosremedios.daw1.prog.ut6.ej63;

public class Ejercicio63 {
    public static void main(String[] args) {
        int [] numeros={1,2,3,23,4,5};
        System.out.println(numeroMasGrandeConjunto(numeros));

    }

    //Ejercicio 1
    //Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande
    private static int numeroMasGrandeConjunto(int[] numeros) {
        int numGrande = 1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numGrande) {
                numGrande = numeros[i];
            }
        }
        return numGrande;
    }
    //Ejercicio 2
    //A continuación, analiza la complejidad del algoritmo anterior utilizando la notación big-O
    //private static int numeroMasGrandeConjunto(Integer[] numeros) {
    //    int numGrande = 1;                                   O(1)
    //    for (int i = 0; i < numeros.length; i++) {            O(n)
    //        if (numeros[i] > numGrande) {                     O(n)
    //            numGrande = numeros[i];                       0(n)
    //        }
    //    }
    //    return numGrande;                                      0(1)
    //}
    // Su complejidad es la siguiente;
    // O(2)+ 3 O(n) = O(n)


    //Ejercicio 3
    //        ¿Crees que influye la cantidad de números del conjunto en el tiempo que tardará tu
    //algoritmo en resolver el problema? ¿Podrías indicar cuál es el caso más favorable y el peor
    //caso?

    // La cantidad de números del conjunto si influye en el tiempo que tardara el algoritmo.
    // Esto es porque la complejidad es directamente proporcional a los datos de entrada (O(n))
    // Es un orden de complejidad lineal.
    // El caso mas favorable es que el numero mas grande se encuentre al principio
    // El peor caso es aquel en el que en cada iteración del bucle encuentre un numero mas grande

    /*
    Ejercicio 4 (Opcional)
    Intenta averiguar qué hace el siguiente algoritmo:

    public static void misterioso(Integer[] array){
        for (int i = 0; i < array.length - 1; i++){
            int indiceMenor = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < array[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int temp = array[i];
            array[i] = array[indiceMenor];
            array[indiceMenor] = temp;
        }
    }
  Este metodo se encarga de ordenar un array dado de menor a mayor
  su complejidad es la siguiente;
    //3 O(n²) + 5 O(n) = 0(n²)
     */
}