package org.ieslosremedios.daw1.prog.ut6;
import java.util.*;

public class EjemploLanzamientoExcepcion {
        public static void main(String[] args) {

            List<Integer>listanum=new LinkedList<>();

            containsRepeated(listanum,1);
            containsRepeated(listanum,2);
            containsRepeated(listanum,3);

            try{
                System.out.println("Añadimos valores:");
                containsRepeated(listanum,3);
            }catch (NoRepetidoExcepcion s){
                s.printStackTrace();
                System.out.println(s.getMessage());
            }catch (IllegalArgumentException s){
                s.printStackTrace();
                System.out.println(s.getMessage());
            }finally {
                System.out.println("Final de programa");
            }

        }
        private static void containsRepeated(List<Integer>a,Integer b){
            if (a.contains(b)){
                throw new NoRepetidoExcepcion("No se pueden repetir valores");
            } else {
                a.add(b);
                System.out.println("Se ha añadido " +b+ " a la lista");
            }
        }
    }
