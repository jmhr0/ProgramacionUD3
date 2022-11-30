package org.ieslosremedios.daw1.prog.ut3;

public class Main {
    final static Integer A = 2;
    final static Integer B = 3;
    final static Integer C = 4;
    final static float A_Decimal= 2.5F;
    final static float B_Decimal= 3.3F;
    final static String OPERACION = "Suma";

    enum Operacion {
        Suma,Resta,Multiplicacion,Division
    }

    public static void main(String[] args) {


        CalculadoraBasica basica = new CalculadoraBasica();
        //es un objeto de la clase basica y nos permite usar todos sus metodos

        //Sobrecarga de metodos

        basica.Suma(A,B);

        basica.Suma(A,B,C);

        basica.Suma(A_Decimal,B_Decimal);

        basica.Resta(A,B);

        basica.Resta(A,B,C);

        basica.Multiplicacion(A,B);

        basica.Multiplicacion(A,B,C);

        basica.Division(A,B);

        basica.Division(A,B,C);

        Operacion Operacionseleccionada = Operacion.Multiplicacion;

        switch (Operacionseleccionada) {
            case Suma:
                Integer ResultadoSuma = basica.Suma(A,B);
                System.out.println("La suma de " + A + "+" + B + "=" + basica.Suma(A, B));
                break;
            case Resta:
                Integer ResultadoResta = basica.Resta(A, B);
                System.out.println("La resta de " + A + "-" + B + "=" + basica.Resta(A, B));
                break;
            case Multiplicacion:
                Integer ResultadoMultiplicacion = basica.Multiplicacion(A, B);
                System.out.println("La Multiplicacion " + A + "*" + B + "=" + basica.Multiplicacion(A, B));
                break;
            case Division:
                Integer ResultadoDivision = basica.Division(A,B,C);
                System.out.println("La Division de " + A + "/" + B + "=" + basica.Division(A, B));
                break;

        /*
        if (OPERACION=="Suma") {

            Integer ResultadoSuma = basica.Suma(A, B);
            System.out.println("La suma de " + A + "+" + B + "=" + basica.Suma(A, B));
        }
        Integer ResultadoResta = basica.Resta(A,B);
        System.out.println("La resta de " + A + "-" + B + "=" + basica.Resta(A,B) );

        Integer ResultadoMultiplicacion = basica.Multiplicacion(A,B);
        System.out.println("La Multiplicacion " + A + "*" + B + "=" + basica.Multiplicacion(A,B) );

        Integer ResultadoDivision = basica.Division(A,B);
        System.out.println("La Division de " + A + "/" + B + "=" + basica.Division(A,B) );
         */

        }
    }
}