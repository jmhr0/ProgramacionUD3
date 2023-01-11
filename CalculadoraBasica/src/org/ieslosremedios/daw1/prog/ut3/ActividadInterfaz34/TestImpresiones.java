package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public class TestImpresiones {
    public static void main(String[] args) {

        /** 9.- En el método main, en lugar de crear objetos de tipo Impresora y Consola, créalos todos de tipo Imprimible. ¿Sigue funcionando
         igual? ¿Por qué? Contestar en un comentario


         Imprimible Impresora1 = new Impresora()
         Imprimible Consola1 = new Consola()


         No funciona, ya que el método "borrar" no es parte de "Imprimible" , así que los nuevos constructores que hemos creado,
         en caso de ser de tipo Imprimibles no tendrían acceso al metodo y no lo podrían realizar, se podría solucionar
         y simplicar si hubiesemos usado solo una interfaz que tuviese los metodos "imprime" y "borrar"
         */

        Impresora Impresoratest = new Impresora();
        Impresoratest.imprime(); //contenido por defecto
        Impresoratest.borrar(); //contenido al borrar
        Impresoratest.establecerContenido("Esto es un test");


        System.out.println("----");


        Consola Consolatest = new Consola();
        Consolatest.imprime(); //contenido por defecto
        Consolatest.borrar(); //contenido al borrar
        Consolatest.establecerContenido("Esto es un test");
    }
}
