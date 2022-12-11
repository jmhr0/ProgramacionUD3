package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2;

//utlizamos la clase persona creada en clase (importamos la libreria) para que Alumno herede de ModeloPersona
import org.ieslosremedios.daw1.prog.ut3.Modelopersona;

public class Alumno extends Modelopersona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected Integer edad;
    protected boolean repetidor;
    protected double NotaMedia;
    protected String correoElectronico;
    //(ejercicio4) añadimos una relacion de composicion con la clase de la direccion (Direccionpractica3)
    protected Direccionpractica3 direccionpractica3;

    protected Alumno(){}

    protected Alumno(String nombre, String apellido1, String apellido2, Integer edad){
        nombre=this.nombre;
        apellido1=this.apellido1;
        apellido2=this.apellido2;
        edad=this.edad;

    }
    //metodo creado segun ejercicio8
    Float notaMedia (float a,float b){
        float notamayor;
        notamayor=Math.max(a,b);
        return notamayor;
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

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    public double getNotaMedia() {
        return NotaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.NotaMedia = notaMedia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
