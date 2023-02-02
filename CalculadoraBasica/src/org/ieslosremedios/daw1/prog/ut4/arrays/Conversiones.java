package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.sql.SQLOutput;

public class Conversiones {
    public static void main(String[] args) {
        // variable primitiva de valor 1
        int num1= 1;
        //variable tipo envoltorio de valor 2
        Integer num2= 2;
        //convertir la variable primitiva a cadena
        System.out.println(num1 + "");
        System.out.println(String.valueOf(num1));
        //convertir la variable tipo envoltorio a cadena
        System.out.println(Integer.toString(num2));
        System.out.println(String.valueOf(num2));








        //Transformacion de cadenas a un tipo primitivo
        int a = Integer.parseInt("1");
        System.out.println(a+1);
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
        Long c = Long.parseLong("2313");
        Double d = Double.parseDouble("3213");
        Float e = Float.parseFloat("3231");

        //Transformacion de cadena a un tipo envoltorio
        Integer integer= Integer.valueOf("1");
        Double doble= Double.valueOf("1.111111");
        System.out.println();

        //Transformacion numerico a String
        String s= 1 + "";
        s= String.valueOf(12);
        System.out.println(s);
        integer.toString();

    }
}
