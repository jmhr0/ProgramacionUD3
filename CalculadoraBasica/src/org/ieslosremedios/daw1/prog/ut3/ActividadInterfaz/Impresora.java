package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz;

public class Impresora implements Imprimible, Borrable {
    static String pagina="estas en la pagina 23";
    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void borrar() {

    }
}