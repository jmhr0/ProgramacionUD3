package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public class Consola implements Imprimible,Borrable {
    private String pantalla="$";

    public void imprime() {
        System.out.printf("%S", pantalla);
    }
    public void establecerContenido(String contenido) {
        System.out.printf("%S", contenido + "" + pantalla);
    }


    public void borrar() {
        System.out.println("***************************");
    }
}
