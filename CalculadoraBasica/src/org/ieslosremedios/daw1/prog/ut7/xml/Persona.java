package org.ieslosremedios.daw1.prog.ut7.xml;

import org.ieslosremedios.daw1.prog.ut7.practica.ClasesAImportar.Direccion;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 7538408627811540752L;
    public String nombre;

    public Persona padre;
    public String apellido;

    public int edad;



    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        this.nombre="";
        this.edad=0;
    }

    public Persona(String nombre) {
        this.nombre= nombre;
    }

    public Persona(String nombre, String apellido, int edad, Persona padre) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.padre=padre;
    }
}