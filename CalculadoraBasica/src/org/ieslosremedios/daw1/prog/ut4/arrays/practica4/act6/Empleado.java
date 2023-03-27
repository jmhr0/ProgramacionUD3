package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.act6;

public class Empleado {
    String codigoEmpleado;
    String DNI;
    String nombre;
    String primerApellido;
    String segundoApellido;
    Integer añoNacimiento;
    Boolean reduccionJornada;

    Empleado(){}

    Empleado(String codigoEmpleado, String DNI, String nombre, String primerApellido, String segundoApellido,
             Integer annoNacimiento, Boolean reduccionJornada){
        this.codigoEmpleado = codigoEmpleado;
        this.DNI = DNI;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.añoNacimiento = annoNacimiento;
        this.reduccionJornada = reduccionJornada;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "Codigo del empleado=' " + codigoEmpleado + '\'' +
                ", DNI=' " + DNI + '\'' +
                ", nombre=' " + nombre + '\'' +
                ", Primer Apellido=' " + primerApellido + '\'' +
                ", Segundo Apellido=' " + segundoApellido + '\'' +
                ", Año de Nacimiento= " + añoNacimiento +
                ", Reducción de jornada= " + reduccionJornada +
                '}';
    }
}