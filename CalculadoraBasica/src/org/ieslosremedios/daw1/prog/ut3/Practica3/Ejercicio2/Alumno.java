package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2;

//utlizamos la clase persona creada en clase (importamos la libreria) para que Alumno herede de ModeloPersona
import org.ieslosremedios.daw1.prog.ut3.Modelopersona;
import org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1.Casa;
//importe de la clase Persona creada en el ejercicio 1 en otro paquete para usarla en la herencia
import org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1.Persona;

public class Alumno extends Persona {
    //Ejercicio 2, campos accesibles mediante getters y setters pero encapsulando la información
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private boolean repetidor;
    private double NotaMedia;
    private String correoElectronico;

    //(ejercicio4) añadimos una relacion de composicion con la clase de la direccion (Direccionpractica3)
    private Direccionpractica3 direccionpractica3;
    //composicion con casa para poder darle a un alumno una casa (se necesita importar el paquete de casa ya que se ha hecho aparte)
    private Casa casa;

    //Ejercicio 2, Constructor sin parametros
    //Al heredar los campos de persona el constructor por defecto de alumno tendría un error porque daría información redundante

    Alumno(){
        super();

    }
    //Ejercicio 2, Constructor con parametros nombre, apellidos y edad
    /*Ejercicio 3, Añadimos las restricciones para que sea necesario recibir un nombre, los apellidos y la edad
    /* mediante this. para referirnos los campos de la clase y no a los parametros formales del metodo
     */
    //Ejercicio 7, adaptamos el constructor de la clase Alumno para que herede los campos de la clase padre (Persona)
    protected Alumno(String nombre, String apellido1, String apellido2, Integer edad){
        super(nombre, apellido1, apellido2, edad);
    }
    //Ejercicio 8, metodo creado con la libreria math
    static Double notaMedia (double a,double b){
        double notamayor;
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

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Direccionpractica3 getDireccionpractica3() {
        return direccionpractica3;
    }

    public void setDireccionpractica3(Direccionpractica3 direccionpractica3) {
        this.direccionpractica3 = direccionpractica3;
    }
}
