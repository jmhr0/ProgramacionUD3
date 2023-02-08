package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ejercicioLinkedHashSet {
    public static void main(String[] args) {
        Set<String> conjunto2 = new LinkedHashSet<>();
        conjunto2.add("Juanma");
        conjunto2.add("Dani");
        conjunto2.add("David");
        conjunto2.add("Adri");
        conjunto2.add("Pablo");
        conjunto2.add("Jorge");
        System.out.println("Todo ordenado segun insercion");
        System.out.printf(conjunto2.toString());
        Iterator<String> it= conjunto2.iterator();
    }
}
