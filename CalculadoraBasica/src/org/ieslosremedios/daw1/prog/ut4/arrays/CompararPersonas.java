package org.ieslosremedios.daw1.prog.ut4.arrays;

import org.ieslosremedios.daw1.prog.ut4.arrays.Persona;

public class CompararPersonas {
    public static void main(String[] args) {
        Persona p1=new Persona("pepe");
        p1.nombre="p1";
        Persona p2=new Persona("pepe2");
        p2.nombre="p1";

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
