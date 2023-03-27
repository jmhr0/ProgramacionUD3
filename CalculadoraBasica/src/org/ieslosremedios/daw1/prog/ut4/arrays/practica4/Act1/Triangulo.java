package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.Act1;

import org.ieslosremedios.daw1.prog.ut3.examen.Color;

public class Triangulo extends Geometria implements Coloreable {
    private double base;
    private double altura;
    private double lados = 3d;
    String color;

    public Triangulo(double base, double altura, double lados){
        this.base = base;
        this.altura = altura;
        this.lados = lados;
    }


    @Override
    double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = lados + base;
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }
}