package org.ieslosremedios.daw1.prog.ut7.actividad71.act7;

import java.io.File;
import java.io.PrintWriter;
public class PrintWriterExample {
    public static void main(String[] args) throws Exception {
        //Lo que saldra por consola al realizar la escritura
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Operacion Completada");
        writer.flush();
        writer.close();
        //Lo que se escribira en el archivo al realizar la escritura
        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File("C:/Users/1DAW_2223_03/Downloads/testprintwriter"));
        writer1.write("Testeo dentro del fichero");
        writer1.flush();
        writer1.close();
    }
    //Jerarquía de clases
    //java.lang.Object
    //java.io.Writer
    //java.io.PrintWriter
    //Clase de java que nos permite escribir un stream de datos
    // Creates a FileWriter
}