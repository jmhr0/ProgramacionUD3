package org.ieslosremedios.daw1.prog.ut3.examen;

public class Persona {
    private String nombre;
    private String dni;
    private Integer edad;
    private Boolean sexo;
    public Entrenador entrenador;

    Persona (){

    }

    Persona (String nombre){
        this.nombre=nombre;
    }

    protected void saludar(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }
}
