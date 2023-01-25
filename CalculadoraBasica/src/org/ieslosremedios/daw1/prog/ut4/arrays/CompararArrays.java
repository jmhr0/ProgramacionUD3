package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class CompararArrays {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={1,2,3};
        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));
        a[0]=0;
        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));
    }
}
