package org.ieslosremedios.daw1.prog.ut7.act6;

import java.io.*;

public class DataInputStream {

         // Jerarquía de clases
         // java.lang.Object
         //  java.io.OutputStream
         //      java.io.FilterOutputStream
         //          java.io.DataOutputStream
         // Permite escribir datos de tipo primitivo, indepedientemente de la máquina al usar el archivo, se nos mostrarán datos erroneos (sobretodo datos númericos)
         //
         //
        public static void main(String[] args) throws IOException{
            DataOutputStream salida=null;
            try {
                salida = new DataOutputStream(new FileOutputStream("C:/Users/usuario/Downloads/testsalida.txt"));
                salida.writeChars("Hola");
                salida.writeChars("Hola2");
                salida.writeChar('\n');
                salida.writeUTF("salto de linea");
                salida.writeChar('\n');
                salida.writeInt((int)123);
            }catch (FileNotFoundException fi){
                System.out.println(fi.getMessage());
            }finally {
                if (salida!=null){
                    salida.close();
                }
                System.out.println("Fin de programa");
            }
        }
    }