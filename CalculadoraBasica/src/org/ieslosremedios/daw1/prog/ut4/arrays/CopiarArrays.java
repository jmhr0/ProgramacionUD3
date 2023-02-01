package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class CopiarArrays {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = a.clone();
        a[0]=0;
        //Prueba de copiado de contenidos y referencias
        System.out.println(Arrays.toString(a));
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        System.out.println(b);

        //Arrays de objetos
        Persona persona1 = new Persona("p1",21);
        //usamos el metodo toString de la clase persona (sobrecargado sobre el toString de object)
        System.out.println(persona1.toString());
        Persona persona2 = new Persona("p2",22);
        Persona persona3 = new Persona("p3",23);
        //array de objetos y copiado arrays de objetos
        Persona [] gentes = {persona1,persona2,persona3};
        Persona [] personas = gentes.clone();

        //Impresion clasica para arrays
        for (Persona p: gentes){
            System.out.println(p.nombre);
        }
        for (int i = 0; i < gentes.length; i++) {
            System.out.println(gentes[i].nombre);
        }
        //copia el array desde el 0 hasta el numero especificado
        Arrays.copyOf(a,14);
        //copia el array desde el numero especificado en primer lugar hasta el segundo
        Arrays.copyOfRange(a, 0,3);
    }
}
