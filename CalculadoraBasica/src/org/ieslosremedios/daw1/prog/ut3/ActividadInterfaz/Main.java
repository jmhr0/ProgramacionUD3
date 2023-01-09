package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz;

public class Main {
    public static void main(String[] args) {
        Imprimible a= new Impresora();
        a.imprime();

        Imprimible b= new Consola();
        b.imprime();

        Borrable c= new Consola();
        Borrable d= new Impresora();

    }


}