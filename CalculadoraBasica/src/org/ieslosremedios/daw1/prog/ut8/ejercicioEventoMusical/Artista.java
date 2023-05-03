package org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Artista implements Serializable {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer Edad;

    public Artista (){

    }

    public Artista(String nombre, String apellido1, String apellido2, Integer edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        Edad = edad;
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
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }
}
