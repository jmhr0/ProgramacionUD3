package org.ieslosremedios.daw1.prog.ut6.ej62;

public class Ejercicio62 {
    public static void main(String[] args) {
        cuentaAtras(5);
        System.out.println(sumaNumNatural(5));
        System.out.println(seriefibonacci(11));
        System.out.println(divisioneuclidea(5,10));


    }

    //1
    // Crea una función que imprima los números naturales en orden inverso comenzando por el
    //número n.

    private static void cuentaAtras(int i) {
        if (i > 0) {
            System.out.println(i);
            cuentaAtras(i - 1);
        } else System.out.println("fin");
    }

    // Calcula la suma de los primeros n números naturales utilizando recursividad.
    private static int sumaNumNatural(int i) {
        if (i == 1) return 1;
        else return i + sumaNumNatural(i - 1);
    }

    //Ejercicio 3.
    //Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci.
    static int seriefibonacci(int n) {
        if ((n == 0) || (n == 1))
            return 1;
        else
            return seriefibonacci(n - 1) + seriefibonacci(n - 2);
    }

    // Ejercicio 4.
    // Crea un método que calcule el máximo común divisor (MCD) de dos números enteros
    // (utilizando la división euclídea).

    static int divisioneuclidea(int i,int j) {
        if (j == 0) {
            return i;
        }
        else
            return divisioneuclidea(j, i % j);
    }
}