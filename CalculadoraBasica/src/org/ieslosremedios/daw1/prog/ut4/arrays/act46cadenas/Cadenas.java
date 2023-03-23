package org.ieslosremedios.daw1.prog.ut4.arrays.act46cadenas;

import java.util.Arrays;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println("ap1:");
        String ap1="hola";
        imprimirLongitudCadena(ap1);
        System.out.println("ap2:");
        String ap2="adios";
        caracterEn(ap2,3);
        System.out.println("ap3:");
        String ap3="holaaa";
        ocurrenciasCaracter(ap3,'a');
        System.out.println("ap4:");
        String[] ap4={"Cebada","Berenjena","Dedo","Ente","Antonio"};
        imprimeCadenasEnOrdenAlfabético(ap4);
        System.out.println("ap5:");
        String ap5= "Y, viéndole don Quijote de aquella manera, con muestras de tanta tristeza, le dijo: Sábete, Sancho, que no es un hombre más que otro si no hace más que otro";
        codificacion(ap5);
        System.out.println("ap6:");
        int[] numeros={4,9,13,5,43};
        System.out.println(Arrays.toString(convertirYOrdenar(numeros)));

    }
    //Imprimir la longitud de una cadena
    private static void imprimirLongitudCadena(String s) {
        System.out.println(s + " Tiene una longitud de " + s.length());
    }
    public static void caracterEn(String s, int pos){
        System.out.println(s.charAt(pos-1) + " se encuentra en "+ pos );
    }
    public static void ocurrenciasCaracter (String s,char n){
        int ocurrencias=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == n){
                ocurrencias= ocurrencias+1;
            }
        }
        System.out.println("El caracter " + n + " Tiene " + ocurrencias + " Ocurrencias ");
    }
    public static void imprimeCadenasEnOrdenAlfabético (String[] s){
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase(s[i])) {
                System.out.println(s[i]);
            }
        }
    }
    public static void codificacion(String texto){
        String sustituirVocales= texto
                .replaceAll("a","4")
                .replaceAll("e", "3")
                .replaceAll("i","1")
                .replaceAll("o","0")
                .replaceAll("u","v");
        String[] stringArray=sustituirVocales.split("\\.");
        String removerEspacios=sustituirVocales.trim();
        System.out.println(Arrays.toString(stringArray));
    }
    public static String [] convertirYOrdenar(int []a){
        String[] resultado=new String[a.length];
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            resultado[i]=String.valueOf(a[i]);
        }
        return resultado;
    }
}
