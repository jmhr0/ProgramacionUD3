package org.ieslosremedios.daw1.prog.ut3.Actividad32Herencia;

public class Perro extends Animal {
    String raza;

    public Perro () {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    void imprime () {
        System.out.println("¡Guau! me llamo " + nombre + " y soy un " + raza);
    }

    void imprimePorPartes () {
        super.imprime();
        System.out.println(" y soy un " + raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}