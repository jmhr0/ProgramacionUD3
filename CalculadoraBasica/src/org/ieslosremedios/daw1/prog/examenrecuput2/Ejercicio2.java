package org.ieslosremedios.daw1.prog.examenrecuput2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer anyoinicio = 1900;
        Integer anyofin = 1999;
        Integer numbisiestos = 0;
        for (int i = anyoinicio; i <= anyofin; i = i + 4)
            numbisiestos++;

        System.out.println("Desde " + anyoinicio + " hasta " + anyofin + " habra " + numbisiestos + " Años bisiestos" );
    }
}