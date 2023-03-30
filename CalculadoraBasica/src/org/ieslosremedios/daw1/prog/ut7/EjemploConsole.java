package org.ieslosremedios.daw1.prog.ut7;

import java.io.Console;

public class EjemploConsole {
    public static void main(String[] args) {
        int MAX_INTENTOS = 3;

        int intentos = 0;

        Console c= System.console();

        if (c == null) {
            System.err.println("No hay consola.");
        } else {
            System.out.println("Introduzca su nombre: ");
            String username = c.readLine();
            System.out.println("Hola "+username);
            System.out.println("Introduzca su password: ");
            String password = String.valueOf(c.readPassword());
            System.out.println("Su Password es: "+password);
        }
    }
}