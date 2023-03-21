package org.ieslosremedios.daw1.prog.ut4.arrays.aprendizajeYRepaso;

public class Persona {
    String nombre;
    Integer edad;

    Persona (String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String toString() {
        String persona = "Mi nombre es " + nombre + " y tengo " + edad + " años ";
        return persona;
    }
}
