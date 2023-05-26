package org.ieslosremedios.daw1.prog.ut7.actividad74;

public class Persona {
    String Nombre;
    String Telefono;
    String direccion;

    public Persona(String nombre, String telefono, String direccion) {
        Nombre = nombre;
        this.direccion = direccion;
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

