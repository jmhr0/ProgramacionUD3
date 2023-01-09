package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz;

public class Consola implements Imprimible, Borrable {
    static String color="Verde";
    @Override
    public void imprime() {
        System.out.println("hola" + color);
    }

    @Override
    public void borrar() {
        System.out.println("_" );
        color= "blanco";
    }
}
