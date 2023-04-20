package org.ieslosremedios.daw1.prog.ut6.practica6.ej1;

public class Main {
    public static void main(String[] args) {
        try {
            Algo();
        } catch (ExcepcionCustom e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Excepcion generica " + e.getMessage());
        }
    }

    public static void Algo() throws ExcepcionCustom {
        try {
            int res = 5 / 0;
        } catch (ArithmeticException e) {
            throw new ExcepcionCustom("Error, se ha realizado una division entre 0", e);
        }
    }
}