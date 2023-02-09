package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Objects;

public class Persona implements Comparable  {
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String toString() {
        String res= "Me llamo " + nombre + " Y tengo " + edad + " Años";
        return res;
    }
    @Override
    public int compareTo(Object other) {
        Persona otherpersona = (Persona)other;
        return this.edad.compareTo(otherpersona.edad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }
}
