package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import org.ieslosremedios.daw1.prog.ut4.arrays.Persona;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploConjuntos {
    public static void main(String[] args) {
        //Los conjuntos no permiten repeticiones, no tienen orden y permiten nulos
        Set<String> conjunto=new HashSet();
        System.out.println(conjunto.isEmpty());
        conjunto.add("Hola");
        conjunto.add("Hola2");
        conjunto.add("Hola3");
        conjunto.add("Hola4");
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto);
        conjunto.add("Hola");
        System.out.println(conjunto);
        conjunto.add(null);
        System.out.println(conjunto);
        Iterator<String> it= conjunto.iterator();

        String e;
        while (it.hasNext()) {
            e =it.next();
            System.out.println(e);
        }
        System.out.println(conjunto);
        Set<String> conjunto2=new HashSet();
        conjunto2.add("Hola3");
        conjunto2.add("Hola4");
        conjunto2.add("HolaBetis");
        conjunto.removeAll(conjunto2);
        System.out.println(conjunto);

    }
}
