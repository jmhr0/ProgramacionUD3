package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;

    Persona(){

    }
    public Persona (String nombre, String apellido1, String apellido2, Integer edad){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
