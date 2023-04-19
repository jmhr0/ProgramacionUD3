package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.*;

public class TestSerializable {
    public static void main(String[] args) throws IOException {

        //Creo objeto a serializar
        ObjetoSerializable os1 = new ObjetoSerializable(5,5,0);

        //Creo fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_03\\Desktop");

        ObjectOutputStream oos= new ObjectOutputStream(fos);

        //Serializar fichero
        oos.writeObject(os1);
        //Cerrar flujo de datos
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_03\\Desktop");

        ObjectInputStream ois= new ObjectInputStream(fis);


    }
}
