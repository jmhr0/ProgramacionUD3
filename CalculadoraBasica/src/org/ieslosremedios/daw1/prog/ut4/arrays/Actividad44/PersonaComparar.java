package org.ieslosremedios.daw1.prog.ut4.arrays.Actividad44;

public class PersonaComparar {
    String nombre;
    Integer edad;

    PersonaComparar(String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String toString() {
        String persona = "Mi nombre es " + nombre + " y tengo " + edad + " años ";
        return persona;
    }
}
