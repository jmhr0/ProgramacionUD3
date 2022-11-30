package org.ieslosremedios.daw1.prog.ut3;

public class CalculadoraBasica {
    //sobrecarga de metodos

    public static Integer Suma (Integer a,Integer b) {
        return a+b;
    }
    public static float Suma (float a, float b) {
        return a+b;
    }
    public static Integer Suma (Integer a,Integer b,Integer c) {return a+ b + c;}


    public static Integer Resta (Integer a,Integer b)
    {
        return a-b;
    }
    public static Integer Resta (Integer a,Integer b, Integer c)
    {
        return a-b-c;
    }

    public static Integer Multiplicacion (Integer a,Integer b)
    {
        return a*b;
    }
    public static Integer Multiplicacion (Integer a,Integer b, Integer c)
    {
        return a*b;
    }

    public static Integer Division (Integer a,Integer b)
    {
        return a/b;
    }
    public static Integer Division (Integer a,Integer b, Integer c)
    {
        return a/b;
    }
    public static Integer Factorial (Integer n){
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial=factorial+1;
            i++;
        }return factorial;
    }

    //metodo que devuelva el mayor de 3 enteros

    public static Integer Mayor (Integer a,Integer b, Integer c) {
        if (a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;
        //hacer test de funcionamiento
    }
    public static Integer Mayor (Integer a,Integer b) {
        return (a>b)?a:b;
    }
}