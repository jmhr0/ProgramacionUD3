package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz;

public class Impresora implements Imprimible {
    String pagina;

    Impresora(){
        pagina=Imprimible.pagina;
    }

    @Override
    public void imprime(){
        System.out.println(pagina);
    }
}
