package org.ieslosremedios.daw1.prog.ut4.arrays.recorrerUnArray;
import java.util.Arrays;

public class BuscarElementoEnArray {
    public static void main(String[] args) {
        int a[] = {0,5,10,15,20,25};
        int z[] = {25,20,15,10,5,0};
        int b = 0;
        System.out.println(Arrays.binarySearch(a, 5));
        System.out.println(buscar(a,5));
        System.out.println(Arrays.binarySearch(z,20));
        Arrays.sort(z); //metodo para ordenar un array
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.binarySearch(z,20));
    }

    //continuar
    public static int buscar(int a[], int b) {
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) ;
        }
        return b;
    }
}