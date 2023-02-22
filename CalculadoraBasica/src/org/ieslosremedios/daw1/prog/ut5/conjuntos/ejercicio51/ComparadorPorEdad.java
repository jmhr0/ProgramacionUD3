package org.ieslosremedios.daw1.prog.ut5.conjuntos.ejercicio51;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona> {
        @Override
        public int compare(Persona a, Persona b) {
            Persona p1 = (Persona) a;
            Persona p2 = (Persona) b;

            if (p1.getEdad() == p2.getEdad())
                return 0;

            if (p1.getEdad() > p2.getEdad())
                return 1;

            else return -1;
        }
    }
