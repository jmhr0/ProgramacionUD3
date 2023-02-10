package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.ArrayList;

public class ListaDeArrays {
    public static void main(String[] args) {
        ArrayList<String> listadeArrays = new ArrayList<String>();
        listadeArrays.add("Persona 1");
        listadeArrays.add("Persona 2");
        listadeArrays.add("Persona 3");
        listadeArrays.add("Persona 4");
        listadeArrays.add("Persona 5");
        System.out.println(listadeArrays);

        System.out.println(listadeArrays.get(2));

        System.out.println(listadeArrays.remove(3));
        System.out.println(listadeArrays);
        System.out.println(listadeArrays.remove("Persona 5"));
        System.out.println(listadeArrays);
        System.out.println(listadeArrays.set(0,"Z"));
        System.out.println(listadeArrays);
    }
}
