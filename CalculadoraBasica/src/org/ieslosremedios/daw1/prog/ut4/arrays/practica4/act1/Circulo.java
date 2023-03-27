package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.act1;

public class Circulo extends Geometria implements Coloreable {
    private double radio;
    String color;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calcularArea() {
        double area = 3.14 * (radio*radio);
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 3.14 * (radio*2);
        return perimetro;
    }
}
