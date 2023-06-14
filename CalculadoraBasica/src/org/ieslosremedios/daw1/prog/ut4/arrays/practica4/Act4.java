package org.ieslosremedios.daw1.prog.ut4.arrays.practica4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Act4 {
    public static void main(String[] args) {
        String dni = "12345678Z";

        if (esDNIValido(dni)) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }
    }

    public static boolean esDNIValido(String dni) {
        // Expresión regular para validar el formato del DNI
        String exreg = "^\\d{8}[A-HJ-NP-TV-Z]$";
        Pattern pattern = Pattern.compile(exreg);
        Matcher matcher = pattern.matcher(dni);

        if (!matcher.matches()) {
            return false; // No cumple con el formato requerido
        }

        // Extraer el número y la letra del DNI
        String numeroStr = dni.substring(0, 8);
        int numero = Integer.parseInt(numeroStr);
        char letra = dni.charAt(8);

        // Calcular la letra correspondiente al número del DNI
        char letraCalculada = calcularLetraDNI(numero);

        // Verificar si la letra calculada coincide con la letra del DNI
        return letra == letraCalculada;
    }

    public static char calcularLetraDNI(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numero % 23;
        return letras.charAt(indice);
    }
}
