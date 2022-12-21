package org.ieslosremedios.daw1.prog.Examenrecuput2;

    public class Ejercicio1 {
        public static void main(String[] args) {
            int a = 7, b = 5, c = 2;
            //el mayor
            if (a > b && a > c) {
                System.out.println(a);
            } else if (b > a && b > c) {
                System.out.println(b);
            } else if (c > a && c > b) {
                System.out.println(c);
            }
        }
    }