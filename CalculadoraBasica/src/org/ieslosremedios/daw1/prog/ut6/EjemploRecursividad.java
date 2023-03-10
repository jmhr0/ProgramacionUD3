package org.ieslosremedios.daw1.prog.ut6;

public class EjemploRecursividad {
    public static void main(String[] args) {
        System.out.println(factorialRecursivo(5));
        cuentaAtras(5);
    }
    static void metodoA() {
        metodoA();

    }
    private static void cuentaAtrasFor(int s){
        for (int i = s; i>0 ; i--) {
            System.out.println(s);
            s--;
        }
        System.out.println("fin For");
    }
    private static void cuentaAtras(int i){
        if (i>0){
            System.out.println(i);
            cuentaAtras(i-1);
        }else System.out.println("fin");
    }
    public static int factorialRecursivo(int x)
    {
        if (x==1) return 1;
        else return x*factorialRecursivo(x-1);
    }

    public static void factorialFor(int n)
    {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
