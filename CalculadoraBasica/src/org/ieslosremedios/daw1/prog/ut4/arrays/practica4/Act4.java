package org.ieslosremedios.daw1.prog.ut4.arrays.practica4;

public class Act4 {
    public static void main(String[] args) {
        String testdnibueno = "78488780S";
        String testdnimalo = "78323123Z";
        System.out.println("--Dni bueno--");
        validarDNI(testdnibueno);
        System.out.println("--Dni malo--");
        validarDNI(testdnimalo);
    }

    private static void validarDNI(String dni) { //Se comprobara que el dni tiene 9 espacios de los cuales el que se encuentra en la posicion 8 es una letra
        if (dni.length() == 9 && Character.isLetter(dni.charAt(8)) == true && numCorrecto(dni) == true && lastCharCorrecto(dni) == true) {
            System.out.println("Válido");
        }
        else System.out.println("No Válido");
    }

    private static boolean numCorrecto(String dni) { //El metodo formato correcto iterara sobre el array dni-1 para asegurarse de que no cogera la letra que va en ultima posicion
                                                        // en caso de no encontrar ninguna letra en las 8 primeras posiciones, devolvera true para el metodo validaDNI
        for (int i = 0; i < dni.length() - 1; i++) {
            if (Character.isLetter(dni.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean lastCharCorrecto(String dni){
        int conversionNumDNI = Integer.parseInt(dni.substring(0,8)); //Se usa substring para solo usar las posiciones del 0 al 8 para la obtencion de la letra
                                                                    //Se usa parseint ya que el dni es una cadena
        char[] alfabetoPosible = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int posibleLetra = conversionNumDNI % 23;
        //Creamos la variable "letraCorrecta" de tipo Character que será igual a la letra en la posición del array del resto
        char candidato = alfabetoPosible[posibleLetra];

        if(dni.charAt(8) == candidato) {
            return true;
        }
        else return false;
    }
}
