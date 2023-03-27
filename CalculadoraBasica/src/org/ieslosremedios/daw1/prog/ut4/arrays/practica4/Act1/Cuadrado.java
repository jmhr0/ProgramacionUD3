package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.Act1;

public class Cuadrado extends Geometria implements Coloreable {
private double lado;
String color;
    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        double area = lado*lado;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 4*lado;
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }
}