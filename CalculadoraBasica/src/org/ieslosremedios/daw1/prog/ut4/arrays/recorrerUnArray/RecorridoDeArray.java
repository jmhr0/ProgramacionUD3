package org.ieslosremedios.daw1.prog.ut4.arrays.recorrerUnArray;

public class RecorridoDeArray {

    public static void main(String[] args) {
        int[] a = {7, -2, 5, 0, 6};
        int[] b = {10,15,3,5,7};

        System.out.println(Sumarrayfor(a));

        System.out.println(Sumarrayfor(a) + Sumarrayfor(b));

        //For each
        System.out.println(Sumarrayforeach(a));

        System.out.println(Sumarrayforeach(a) + Sumarrayforeach(b));
    }
    private static Integer Sumarrayfor(int[] a) {
        int b=0;
        for (int i = 0; i < a.length; i++)
            b = b + a[i];
        return b;
    }
    private static Integer Sumarrayforeach(int[] a) {
        int b = 0;
        for (Integer e:a) {
            b += e;
        }
        return(b);
    }
}