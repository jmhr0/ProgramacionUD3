package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class Act42OperacionesConArrays {
    public static void main(String[] args) {
        int []array1=new int[10];
        int [][]array2=new int[10][11];
        for (int i = 0; i <=10 ; i++) {
            for (int j = 0; j <=array2.length ; j++) {
                System.out.println(Arrays.toString(array2));

            }
        }
    }
}