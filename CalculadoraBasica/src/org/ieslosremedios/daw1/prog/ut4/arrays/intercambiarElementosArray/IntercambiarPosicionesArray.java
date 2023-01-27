package org.ieslosremedios.daw1.prog.ut4.arrays.intercambiarElementosArray;

import java.util.Arrays;

public class IntercambiarPosicionesArray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        //arreglar
        System.out.println(Arrays.toString());



    }
    public int[] intercambiarposiciones(int [] a){
        int[] b=new int[5];
        int aux = b[b.length-1];
        b[0]=aux;
        System.arraycopy(a,0,b,0,a.length);
        for (int i = 0; i<a.length ; i--) {
            b[i]=b[i-1];
        }
        return b;
    }
}
