package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) throws IOException {

        Scanner scannerEntrada = new Scanner(System.in);

        String nombre = scannerEntrada.nextLine();

        System.out.println(nombre);

        System.out.println("Introduzca su nombre ");
        int c1= System.in.read();
        int c2= System.in.read();
        int c3= System.in.read();
        int c4= System.in.read();

    }
}