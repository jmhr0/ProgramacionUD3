package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public class Consola implements Imprimible,Borrable {
    private String pantalla="$";
    String prompt="$";
    Consola(){
        pantalla=Imprimible.TEXTO_POR_DEFECTO;
    }

    public void imprime() {
        System.out.printf("%S%n", pantalla);
    }
    public void establecerContenido(String contenido) {
        pantalla= prompt + "" + contenido;
    }


    public void borrar() {
        System.out.println("**********************");
    }
}
