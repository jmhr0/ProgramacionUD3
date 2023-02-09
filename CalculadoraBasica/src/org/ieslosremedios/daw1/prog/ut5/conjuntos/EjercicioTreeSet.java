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
        Set<String> conjuntoString = new TreeSet<>();
        conjuntoString.add("Pepe");
        conjuntoString.add("Roman");
        conjuntoString.add("Juanma");
        Iterator<String> itString = conjuntoString.iterator();
        while (itString.hasNext()){
            System.out.println(itString.next() + " ");
        }
        System.out.println(" ");
        Set<Persona> conjuntoPersona = new TreeSet<>();
        Persona David2 = new Persona("Juanma2", 26);
        Persona Juanma = new Persona("Juanma", 20);
        Persona Christian = new Persona("Christian", 19);
        Persona Daniel = new Persona("Daniel", 21);
        Persona David = new Persona("David", 24);
        Persona David3 = new Persona("Juanma3", 28);
        conjuntoPersona.add(Juanma);
        conjuntoPersona.add(Christian);
        conjuntoPersona.add(Daniel);
        conjuntoPersona.add(David);
        conjuntoPersona.add(David2);
        conjuntoPersona.add(David3);
        Iterator<Persona> itPersona = conjuntoPersona.iterator();
        while (itPersona.hasNext()){
            System.out.println(itPersona.next() + " ");
        }
        System.out.println(" ");
    }
}
