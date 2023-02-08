package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioTreeSet {
    public static void main(String[] args) {
        Set<Integer> conjunto = new TreeSet<>();
        conjunto.add(5);
        conjunto.add(3);
        conjunto.add(8);
        Iterator<Integer> it = conjunto.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println(" ");
    }
}
