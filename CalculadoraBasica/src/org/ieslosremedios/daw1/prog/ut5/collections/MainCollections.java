package org.ieslosremedios.daw1.prog.ut5.collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class MainCollections {
    public static void main(String[] args) {
        //1.-Crear par de colecciones distinto
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        HashSet<Integer> B = new HashSet<>();
        B.add(1);
        B.add(2);
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(6);

        List<Integer> C = new ArrayList<Integer>(B);
        //2.-Metodo para desordenar la lista
        Collections.shuffle(A);
        Collections.shuffle(C);
        System.out.println(A);
        System.out.println(C);

        //3.-Metodo para ordenar la lista
        Collections.sort(A);
        System.out.println(A);
        //4.-Metodo para darle orden inverso a la lista
        Collections.reverse(A);
        System.out.println(A);
        //5.- Metodo para buscar en la lista
        Collections.sort(A);
        System.out.println(Collections.binarySearch(A,5));

        //6.-convertir a Array
        Arrays.asList(A);

    }
}
