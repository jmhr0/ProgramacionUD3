package org.ieslosremedios.daw1.prog.ut4.arrays.act44toStringdeObject;

import java.util.Arrays;

public class CompararPersonas {
    public static void main(String[] args) {
        //creacion de tipos objeto
        PersonaComparar p1=new PersonaComparar("pepe", 18);
        PersonaComparar p2=new PersonaComparar("pepe2", 20);
        PersonaComparar p3=new PersonaComparar("pepe3", 22);
        //definicion del array con los tipo objeto creados
        PersonaComparar [] personas={p1,p2,p3};
        //referencia del array
        System.out.println(personas);
        //Usamos el metodo Arrays.toString para ver los contenidos del Array
        System.out.println(Arrays.toString(personas));
    }
}
