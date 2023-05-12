package org.ieslosremedios.daw1.prog.ut8.Ejercicio1OODB;

import javax.persistence.Entity;
import javax.persistence.Transient;
@Entity
public class Persona {
    private String nombre;
    @Transient
    private String apellido1;
    @Transient
    private String apellido2;
    @Transient
    private Integer edad;

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

    public Persona() {
    }
}
