package org.ieslosremedios.daw1.prog.ut4.arrays.practica4;

public class Act2 {
    public static void main(String[] args) {
        System.out.println(buscarNumeroOcurrenciasNoRepetido("palabra1 palabra2 palabra3 palabra4 palabra5 palabra1"));

    }

    private static int buscarNumeroOcurrenciasNoRepetido (String texto){
        int contador = 0; //variable para contar ocurrencias
        String[] arrayDeTexto = texto.split(" "); //separamos el texto mediante espacios
        String[] palabrasDistintas = new String[arrayDeTexto.length];
        for (String palabra : arrayDeTexto){ //bucle que iterara el texto en conjunto al metodo declarado esRepetida, que se encargara de solo contar las palabras que se mencionen por primera vez

            if (!esRepetida(palabrasDistintas, contador, palabra)){
                palabrasDistintas[contador] = palabra;
                contador++;
            }
        }
        return contador;
    }

    private static boolean esRepetida(String[] arrayDeTexto, int pos, String palabra){ //este metodo iterara sobre el texto introducido, si la palabra se repite se saldra del bucle mediante la secuencia de escape break
        boolean esrepetida = false;
        for (int i = 0; i < pos; i++){
            if (arrayDeTexto[i].equals(palabra)){
                esrepetida = true;
                break;
            }
        }
        return esrepetida;
    }



}