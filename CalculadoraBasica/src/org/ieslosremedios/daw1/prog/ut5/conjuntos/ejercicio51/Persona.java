package org.ieslosremedios.daw1.prog.ut5.conjuntos.ejercicio51;

public class Persona implements Comparable<Persona>  {
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
        String res= "Me llamo " + this.nombre + " Y tengo " + this.edad + " Años";
        return res;
    }
    // también se puede cambiar para comparar nombre, edad o etc segun su orden natural
    @Override
    public int compareTo(Persona other) {
        Persona otherpersona = (Persona)other; //casting de "other" a "Persona"
        return this.nombre.compareTo(otherpersona.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return this.nombre.equals(persona.nombre);
    }
}
