package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Estudiante extends Persona {
    private Integer Edad;
    private Double Notas;
    private Double nota1;
    private Double nota2;

    public Estudiante() {

    }
    public Estudiante (Integer Edad, Double Notas){
        this.Edad= Edad;
        this.Notas= Notas;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        this.Edad = edad;
    }

    public Double getNotas() {
        return Notas;
    }

    public void setNotas(Double notas) {
        this.Notas = notas;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double CalculoNotaMedia (){
        return (nota1+nota2) / 2;
    }
}
