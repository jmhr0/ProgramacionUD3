package org.ieslosremedios.daw1.prog.ut7;

import java.io.*;

public class Actividad8 {
    public static void main(String[] args) throws IOException {

        File miFichero = new File("C:\\Users\\1DAW_2223_03\\Downloads\\Actividad8Prog");

        FileOutputStream fos = new FileOutputStream(miFichero, true);
        fos.write("hola".getBytes());
        fos.close();

        RandomAccessFile raf = new RandomAccessFile(miFichero, "r");
        raf.read();
    }
}
