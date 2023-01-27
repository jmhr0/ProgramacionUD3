package org.ieslosremedios.daw1.prog.ut4.arrays.eliminacionDeElementos;

import java.util.Arrays;

public class Eliminacion {
    public static void main(String[] args) {
        int [] z = {1,2,3,4};
        eliminararray(z,3);
        System.out.println(Arrays.toString(z));
    }
    static int [] eliminararray (int[] a, int pos){
        int[] b = new int[a.length-1];
        System.arraycopy(a,0,b,0,pos);
        System.arraycopy(a,pos+1,b,pos,a.length-pos-1);
        return b;
    }
}
