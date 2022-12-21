package org.ieslosremedios.daw1.prog.Examenrecuput2;
enum Talla {
    XS, S, M, L, XL, XXL
}
public class Ejercicio4 {
    public static void main(String[] args) {
        Talla camiseta = Talla.L;
        switch(camiseta) {
            case XL: case XXL:
                System.out.println("No esta disponible");
                break;
            case S: case XS:
                System.out.println("Ultimas unidades");
                break;
            case L:
                System.out.println("L");
                break;
            case M:
                System.out.println("M");
                break;
        }
    }
}