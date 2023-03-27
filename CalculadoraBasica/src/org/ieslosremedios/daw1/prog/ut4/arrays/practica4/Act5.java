package org.ieslosremedios.daw1.prog.ut4.arrays.practica4;

public class Act5 {
    public static void main(String[] args) {
        System.out.println( "Su palabra esta repetida " + buscarNumeroOcurrencias("texto de prueba para contar la palabra texto", "texto") + " veces");

    }

    private static int buscarNumeroOcurrencias (String texto, String palabraDeterminada){
        int contador = 0; //variable para contar ocurrencias
        String[] arrayDeTexto = texto.split(" "); //separamos el texto mediante espacios
        for (int i = 0; i < arrayDeTexto.length; i++) {
            if ( palabraDeterminada.equals(arrayDeTexto[i]) ){ //Cuando la palabra que buscamos es igual que la que se encuentra en la posicion i del array sumamos 1 al contador
                contador++;
            }
        }
        return contador;
    }
}
