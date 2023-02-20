package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.TreeSet;

public class Ejercicio51 {
    public static void main(String[] args) {
        ComparadorPorEdad a = new ComparadorPorEdad();
        TreeSet<Persona> compararpersonas = new TreeSet<>(new ComparadorPorEdad());
        //Ya que queremos crear un grupo donde no se repitan personas ni se puedan introducir nulas
        //Mientras que este se encuentra ordenado de manera ascendente, escogeremos el TreeSet para crear el grupo
        //Creamos dos personas de igual nombre, pero diferente edad para poder presenciar como se encuentra ordenado por edad

        Persona Juanma = new Persona("Juanma", 20);
        Persona Juanmaa = new Persona("Juanma", 21);

        //Creamos dos personas iguales para ver como nuestro grupo de personas solo contendrá a 1 de ellas
        //No permitiendo objetos repetidos
        Persona Adri = new Persona("Adri", 19);
        Persona Adrii = new Persona("Adri", 19);
        Persona David = new Persona("David", 35);

        //Vemos también alternativamente como está ordenado según el nombre

        compararpersonas.add(Juanma);
        compararpersonas.add(Juanmaa);
        compararpersonas.add(Adri);
        compararpersonas.add(Adrii);
        compararpersonas.add(David);
        System.out.println(compararpersonas);
    }
}
