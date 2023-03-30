package org.ieslosremedios.daw1.prog.ut7;

import java.io.Console;

public class TestConsole {
    static final String PASSWORD_CORRECTA = "1234";
    static final String USERNAME_CORRECTO = "jmhr";
    public static void main(String[] args) {


        int intentos = 3;

        Console c= System.console();

        while (intentos > 0) {
            System.out.println("Ingrese su username: ");
            String username = c.readLine();
            System.out.println("Ingrese su password: ");
            String password = String.valueOf(c.readPassword());
            if (PASSWORD_CORRECTA.equals(password) && USERNAME_CORRECTO.equals(username)) {
                System.out.println("Bienvenido!");
                intentos= 0 ;
            } else {
                System.out.println("username o password incorrectos, le quedan " + (--intentos) + " intentos.");
            }
        }
        if (intentos == 0 ) {
            System.out.println("Ha excedido el número de intentos permitidos");
        }
    }
}