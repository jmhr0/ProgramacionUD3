package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public class TestImpresiones {
    public static void main(String[] args) {

        /** 9.- En el método main, en lugar de crear objetos de tipo Impresora y Consola, créalos todos de tipo Imprimible. ¿Sigue funcionando
         igual? ¿Por qué? Contestar en un comentario


         Si funciona, ya que el método "borrar" es parte de "Imprimible" por la herencia hecha en el ejercicio anterior
         así que, "Imprimible" ahora tendra acceso a los metodos de "Borrable" y "Editable", con esto, los objetos creados
         de tipo "Imprimible" podrán usar el metodo borrar de "Borrable" (que seria el unico problema en caso de no haber herencia)
         */

        Imprimible Impresoratest = new Impresora();
        Impresoratest.imprime(); //contenido por defecto
        Impresoratest.borrar(); //contenido al borrar
        Impresoratest.imprime();
        Impresoratest.establecerContenido("Esto es un test");
        Impresoratest.imprime();


        System.out.println("----");


        Imprimible Consolatest = new Consola();
        Consolatest.imprime(); //contenido por defecto
        Consolatest.borrar(); //contenido al borrar
        Consolatest.imprime();
        Consolatest.establecerContenido("Esto es un test");
        Consolatest.imprime();
    }
}
