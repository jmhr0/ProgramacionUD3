package org.ieslosremedios.daw1.prog.ut3.Actividad32Herencia;

public class Animal {
    String nombre;
    Animal () {
    }
    Animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡Guau! me llamo " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}