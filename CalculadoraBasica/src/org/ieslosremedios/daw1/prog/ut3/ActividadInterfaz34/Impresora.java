package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public class Impresora implements Imprimible,Borrable {
    static String pagina="TEXTO_POR_DEFECTO";
    public void imprime() {
        System.out.println(pagina);
    }

    public void establecerContenido(String contenido) {
        System.out.println(contenido);
    }


    public void borrar() {
        System.out.println(" ");
    }
}