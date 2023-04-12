package org.ieslosremedios.daw1.prog.ut7;

import java.io.*;

public class EjemploFile {
    public static void main(String[] args) throws IOException {
        // Crear una carpeta
        File miCarpeta = new File("C:\\Users\\1DAW_2223_03\\Downloads\\Carpetatesteo");
        System.out.println(miCarpeta.mkdir());

        // Crear un fichero
        File miFichero = new File("C:\\Users\\1DAW_2223_03\\Downloads\\Carpetatesteo\\test.txt");
        try {
            miFichero.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        FileWriter escritor = new FileWriter("test",true);
        escritor.write("test");
        escritor.close();
        //Abrir fichero en modo binario
        FileOutputStream escritor2 = new FileOutputStream(miFichero,false);
        escritor2.write("Testeo modo binario".getBytes());
        escritor2.close();
        //Abrir fichero modo texto
        FileReader lector = new FileReader(miFichero);
        lector.read();
        //Binario solo lectura
        FileInputStream lecturabinaria = new FileInputStream(miFichero);
    }
}