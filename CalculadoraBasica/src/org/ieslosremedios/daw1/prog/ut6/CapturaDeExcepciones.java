package org.ieslosremedios.daw1.prog.ut6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CapturaDeExcepciones {
    public static void main(String[] args) {
        System.out.println("Comienzo programa");
        try {
           lector("a");

        } catch (ArithmeticException s) {
            System.out.println("No se puede dividir por 0");
            s.printStackTrace();
            s.getMessage();
        } catch (FileNotFoundException n) {
            n.printStackTrace();
        } catch (IOException n) {
            n.printStackTrace();
        } finally {
            System.out.println("fin programa");
        }
    }

    private static void extraido() {
        int dividendo=5;
        int divisor=0;
        System.out.println("Resultado = " + dividendo/divisor);
    }

    //propagacion
    private static int division(int dividendo, int divisor) throws ArithmeticException{
        return dividendo/divisor;
    }

    private static void lector (String filepath) throws  IOException {
        FileReader fileReader= new FileReader(filepath);
        System.out.println(fileReader.read());
        fileReader.close();
    }
    private static void lectorIllegalArgument(Integer num, List lista){
    }
}