package org.ieslosremedios.daw1.prog.ut5.conjuntos.ejercicio51;

import java.util.Collections;
import java.util.TreeSet;

public class Ejercicio51Main {
    public static void main(String[] args) {
        TreeSet<Persona> compararpersonas = new TreeSet<>(new ComparadorPorEdad().reversed());
        //Ya que queremos crear un grupo donde no se repitan personas ni se puedan introducir nulas
        //Mientras que este se encuentra ordenado de manera ascendente, escogeremos el TreeSet para crear el grupo
        //Creamos dos personas de igual nombre, pero diferente edad para poder presenciar como se encuentra ordenado por edad

        Persona Juanma = new Persona("Juanma", 20);
        Persona Juanma2 = new Persona("Juanma", 21);

        //Creamos dos personas iguales para ver como nuestro grupo de personas solo contendrá a 1 de ellas
        //No permitiendo objetos repetidos
        Persona Adri = new Persona("Adri", 23);
        Persona Adri2 = new Persona("Adri", 23);
        Persona Ana = new Persona("Ana", 19);
        Persona David = new Persona("David", 21);
        Persona Z = new Persona("Z", 21);

        //Vemos también alternativamente como está ordenado según el nombre
        compararpersonas.add(Ana);
        compararpersonas.add(Juanma);
        compararpersonas.add(Juanma2);
        compararpersonas.add(Adri);
        compararpersonas.add(Adri2);
        compararpersonas.add(David);
        compararpersonas.add(Z);
        System.out.println(compararpersonas);
    }
}
