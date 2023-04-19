package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.*;

public class ActividadSerialización {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona p1 = new Persona("Yo (Juanma)",21);

        //Creo fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_03\\Documents\\PersonaFamosa.bin");

        ObjectOutputStream oos= new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.close();

        // Leer fichero al Objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_03\\Documents\\PersonaMisteriosa.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Desearizar el contenido del fichero (bytes) a un Object
        Persona osSalida = (Persona)ois.readObject();

        System.out.println("Atributo 1: " + osSalida.nombre);
        System.out.println("Atributo 2: " + osSalida.edad);
    }

}
