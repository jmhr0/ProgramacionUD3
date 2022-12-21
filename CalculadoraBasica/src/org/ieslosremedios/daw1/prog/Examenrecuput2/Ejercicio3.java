package org.ieslosremedios.daw1.prog.Examenrecuput2;

public class Ejercicio3 {
    public static void main(String[] args) {
        Integer a = 20;
        Integer b = 30;
        Integer primo1 = 0;
        Integer primo2 = 0;

        Integer i;
        for (i = a; i <= b; i++)
            if (primo1 % 1 == 0 || primo1 % i == 0) {
                primo1 = i;
            } else if (primo2 % 1 == 0 || primo2 % i == 0) {
                primo2 = i;
            }


        if (primo1 != 0) ;
        System.out.println("primero: " + primo1 + " ultimo: " + primo2);
        if (primo1 == 0 && primo2 ==0) ;
        System.out.println("No existen primos entre ambos numeros");
    }
}
