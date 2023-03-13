package org.ieslosremedios.daw1.prog.ut6.ej61;

public class Ejercicio61 {
    public static void main(String[] args) {
        //1. ¿Cuál es el nombre en Java de la clase que define las excepciones, y de la que debe heredar cualquier clase
        // que queramos usar para representar una excepción?

        //La clase que define las excepciones en java y debe heredar cualquier clase que queramos usar para representar una excepcion recibe el nombre de 'Exception'

        //2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al invocar un
        // método de un objeto cuyo valor es “null”?

        //El nombre de la clase que representan las excepciones al invocar un metodo de un objeto cuyo valor es null es 'NullPointerException'

        //3. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al obtener un
        // comportamiento anómalo en la entrada / salida de información?

        //El nombre en java de la clase que representa las excepciones con una anomalia entrada/salida es 'IOException'


        //4. Observa el siguiente fragmento de código:
        //String [] array_string = new String [25];
        //System.out.println (array_string [3].length());
        //¿Qué excepción se produciría en el mismo?

        //Se produciría una NullPointerException, ya que 'System.out.println (array_string [3].length());' se dirige a una posición del array vacia

        //5. Observa el siguiente fragmento de código:
        //String aux = "hola";
        //int aux2 = Integer.parseInt (aux);
        //¿Qué sucedería al ejecutar el mismo?

        //Se produciría una NumberFormatException, ya que 'parseint' se usa para convertir una cadena en un entero.
        //'parseint' solo funcionaría en caso de que la cadena fuese naturalmente un numero, pero como es una cadena ("hola")
        //no se puede convertir en un entero, dando una excepcion en el formato del numero


        try{
            System.out.println(caracterEn("hola", 2));
            System.out.println(caracterEn("programacion", 5));
        } catch (Exception excepcion) {
            System.err.println(excepcion.getMessage());
        }
    }

    private static char caracterEn(String cadena, int entero) throws Exception {
        if (entero < 0 || entero >= cadena.length()) {
            throw new Exception("Introduce una posición valida");
        } else return cadena.charAt(entero);

    }
}
