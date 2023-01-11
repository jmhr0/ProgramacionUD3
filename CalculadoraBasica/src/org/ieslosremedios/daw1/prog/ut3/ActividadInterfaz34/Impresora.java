package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public class Impresora implements Imprimible,Borrable {
    private String pagina="TEXTO_POR_DEFECTO";

    Impresora(){
        pagina=Imprimible.TEXTO_POR_DEFECTO;
    }
    public void imprime() {
        System.out.println(pagina);
    }

    public void establecerContenido(String contenido) {
        pagina=contenido;
    }


    public void borrar() {
        pagina="";
    }
}