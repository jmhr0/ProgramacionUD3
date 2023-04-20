package org.ieslosremedios.daw1.prog.ut7.actividad72;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Actividad72 {
    public static void main(String[] args) throws IOException, FileAlreadyExistsException {
        //Crea un fichero llamado alumnos.txt dentro de una nueva carpeta con nombre 1DAW, controlando que si ya existe no haga nada. La carpeta debe estar en la raíz de tu usuario.
        File archivo = new File("C:\\Users\\kille\\Downloads\\TestProg\\alumnos.txt");

        //Introduce los nombres de los alumnos de la clase, un alumno por línea del fichero. Utiliza un buffer para realizar esta operación
        FileOutputStream fos = new FileOutputStream(archivo);
        BufferedOutputStream bufer = new BufferedOutputStream(fos);
        bufer.write("yo\n".getBytes());
        bufer.write("Antonio\n".getBytes());
        bufer.write("Ricardo\n".getBytes());
        bufer.write("Pablo\n".getBytes());
        bufer.write("Jossie\n".getBytes());
        bufer.write("José Ramirez Sanchez\n".getBytes());
        bufer.write("Jorge\n".getBytes());
        bufer.write("Adrián\n".getBytes());
        bufer.write("Daniel\n".getBytes());
        bufer.write("Diego\n".getBytes());
        bufer.write("Jonathan\n".getBytes());
        bufer.write("Juan María\n".getBytes());
        bufer.write("Victor\n".getBytes());
        bufer.write("Julian\n".getBytes());
        bufer.write("Jose Antonio Jaén Gómez\n".getBytes());
        bufer.write("David\n".getBytes());
        bufer.write("Juan Manuel Saborido\n".getBytes());
        bufer.close();
        fos.close();
        File archivoNuevo = new File("C:\\Users\\kille\\Downloads\\TestProg\\alumnos2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoNuevo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File archivoRenombrado = new File("C:\\Users\\kille\\Downloads\\TestProg\\alumnosrenom.txt");
        archivoNuevo.renameTo(archivoRenombrado);

        FileWriter flw =new FileWriter("C:\\Users\\kille\\Downloads\\TestProg\\alumnosrenom.txt",true);
        flw.write("Samuel?");
        flw.close();
    }
}