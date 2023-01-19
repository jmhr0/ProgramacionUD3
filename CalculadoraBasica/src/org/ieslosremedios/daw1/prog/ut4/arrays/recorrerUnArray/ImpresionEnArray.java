package org.ieslosremedios.daw1.prog.ut4.arrays.recorrerUnArray;

import java.util.Arrays;

public class ImpresionEnArray {
    static int[] a = {7, -2, 5, 0, 6};
    int[] b = {10,15,3,5,7};
    public static void main(String[] args) {
        System.out.println(a);
        Impresionfor(a);
        System.out.println(Arrays.toString(a));
    }
    private static void Impresionfor(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("}");
    }
}