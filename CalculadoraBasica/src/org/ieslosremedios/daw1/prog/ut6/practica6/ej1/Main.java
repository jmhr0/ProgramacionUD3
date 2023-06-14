package org.ieslosremedios.daw1.prog.ut6.practica6.ej1;

import static org.ieslosremedios.daw1.prog.ut6.practica6.ej1.MiExcepcion.metodoEjemplo;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            metodoEjemplo();
        } catch (java.io.IOException ex) {
            System.out.println("IO exception capturada:  " + ex.getMessage());
        } catch (MiExcepcion ex) {
            System.out.println("Excepcion personalizada capturada: " + ex.getMessage());
        }
    }
}