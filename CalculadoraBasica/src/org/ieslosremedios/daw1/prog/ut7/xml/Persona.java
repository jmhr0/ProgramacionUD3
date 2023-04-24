package org.ieslosremedios.daw1.prog.ut7.xml;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 7538408627811540752L;
    String nombre;
    int edad;
    int telefono;



    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona() {
        this.nombre="";
        this.edad=0;
        this.telefono=0;
    }
}