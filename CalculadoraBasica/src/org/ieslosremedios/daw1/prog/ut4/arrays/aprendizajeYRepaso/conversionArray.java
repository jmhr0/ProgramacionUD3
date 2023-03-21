package org.ieslosremedios.daw1.prog.ut4.arrays.aprendizajeYRepaso;

import java.util.Arrays;

public class conversionArray {
    public static void main(String[] args) {
        int[] numbers= {2,1,11,10};
        String[] strings;
        strings=numToStringAndOrder(numbers);
        System.out.println(Arrays.toString(strings));

    }
    private static String [] numToStringAndOrder(int [] a) {
        String[] strings = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            strings[i]=String.valueOf(a[i]);
        }
        Arrays.sort(a);
        return strings;
    }
}
