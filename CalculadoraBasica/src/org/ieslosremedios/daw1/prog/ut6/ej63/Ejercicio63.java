package org.ieslosremedios.daw1.prog.ut6.ej63;

public class Ejercicio63 {
    public static void main(String[] args) {

    }

    //Ejercicio 1
    //Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande
    private static int numeroMasGrandeConjunto(Integer[] numeros) {
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
    //} O(2)+ 3 O(n) = O(n)
}