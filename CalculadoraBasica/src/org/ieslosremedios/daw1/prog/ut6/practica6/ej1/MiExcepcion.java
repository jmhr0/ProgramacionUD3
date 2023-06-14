package org.ieslosremedios.daw1.prog.ut6.practica6.ej1;

public class MiExcepcion extends Exception {

    public MiExcepcion(String mensaje) {
        super(mensaje);
    }

    public static void metodoEjemplo() throws Exception {
        try {
            // Lanzar una excepción de tipo checked (IOException)
            throw new java.io.IOException("Io exception");
        } catch (java.io.IOException ex) {
            // Lanzar una excepción personalizada (MiExcepcion)
            throw new MiExcepcion("excepción personalizada");
        }
    }
}