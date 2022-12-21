package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz;

public class Principal extends Impresora {
    public static void main(String[] args) {
        Imprimible a1 = new Impresora();
        a1.imprime();
        System.out.println(Imprimible.pagina);
    }
}
