package org.ieslosremedios.daw1.prog.ut4.arrays;

public class Strings {
    public static void main(String[] args) {

        imprimirLongitudCadena("Juanma");
        CaracterEnPosicionEmpezandoEn1("brov", 3);

        String s1 = "hola";
        String s2 = new String("hola");
        String s3 = new String(new char[]{'h', 'o', 'l', 'a'});

        char[] chars = {'c', 'a'};
        String c = new String(chars);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }

    //Enumerar el numero de caracteres de una cadena
    public static void imprimirLongitudCadena(String s) {
        System.out.println("La cadena Tiene " + s.length() + " Caracteres");
    }

    //dada una cadena de texto y numero que diga el caracter de la posicion
    public static void CaracterEnPosicionEmpezandoEn1(String s, Integer a) {
        System.out.println("El caracter en la posicion " + a + " De la palabra " + s + " es " + s.length());
    }
}
