package org.ieslosremedios.daw1.prog.ut7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Actividad9 {
    public static void main(String[] args) {
        try {
            File miarchivo = new File("C:\\Users\\1DAW_2223_03\\Downloads\\Actividad9");
            if(miarchivo.exists()){
                miarchivo.delete();
            }
            miarchivo.createNewFile();

            RandomAccessFile raf = new RandomAccessFile(miarchivo,"rw");
            raf.write("defg".getBytes());
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.write("hij".getBytes());

            raf.write("abc".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
