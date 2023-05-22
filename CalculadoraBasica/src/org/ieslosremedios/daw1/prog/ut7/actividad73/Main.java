package org.ieslosremedios.daw1.prog.ut7.actividad73;

import org.ieslosremedios.daw1.prog.ut7.xml.Persona;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona padrePersonaMisteriosa = new Persona("Darth vader");
        Persona personaMisteriosa = new Persona("Luke", "Skywalker", 36, padrePersonaMisteriosa);

        //Mi persona

        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_03\\Desktop\\personaMisteriosa.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(personaMisteriosa);
        oos.close();

        //Persona de otro
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_03\\Desktop\\personadeotro.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Persona personadeotro = (Persona) ois.readObject();

        System.out.println(personadeotro.nombre);

        System.out.println(personadeotro.apellido);

        System.out.println(personadeotro.edad);

        System.out.println(personadeotro.padre);
    }
}
