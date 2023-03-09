package org.ieslosremedios.daw1.prog.ut6;

public class ExcepcionesEjercicios {
    public static void main(String[] args) {
        int a=0;
        int b=300;

        try {
            System.out.println("Inicio de programa");
            division(a, b);
        }catch (ArithmeticException s) {
            s.printStackTrace();
            System.err.println("Se ha producido un error");
        }finally {
            System.out.println("Programa finalizado");
        }




    }
    public static int division (int a,int b) throws ArithmeticException{
        return b/a;

    }
}
