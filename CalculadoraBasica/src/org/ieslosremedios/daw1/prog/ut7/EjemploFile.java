package org.ieslosremedios.daw1.prog.ut7;

import java.io.*;

public class EjemploFile {
    public static void main(String[] args) {
        try {
            // Crear un fichero
            File miFichero = new File("C:\\Users\\1DAW_2223_03\\Download\\Nueva carpeta\\Test.txt");
            miFichero.createNewFile();

            // Crear una carpeta
            File miCarpeta = new File("C:\\Users\\1DAW_2223_03\\Downloads\\Nueva carpeta");
            System.out.println(miCarpeta.mkdir());

            // Elimina un fichero
            //miFichero.delete();

            // Elimina una carpeta después de haber borrado su contenido
            //miCarpeta.delete();

            // Abrir fichero en modo texto, escritura y sobreescribiendo
            FileWriter fw = new FileWriter(miFichero);
            fw.close();

            // Abrir fichero en modo texto, escritura y añadiendo al final (append=true)
            fw = new FileWriter(miFichero, true);
            fw.write("Juan");
            fw.close();

            // TODO: Abrir fichero en modo binario, escritura y añadiendo al final
            FileOutputStream fos = new FileOutputStream(miFichero, true);
            fos.write(" Manuel".getBytes());
            fos.close();

            // TODO: Abrir fichero en modo texto, lectura
            FileReader fr = new FileReader(miFichero);
            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char) i);
            }

            // TODO: Abrir fichero en modo binario, lectura
            FileInputStream fis = new FileInputStream(miFichero);
            System.out.println(new String (fis.readAllBytes()));

            // TODO: Abrir fichero en modo de acceso directo
            RandomAccessFile raf = new RandomAccessFile(miFichero, "r");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}