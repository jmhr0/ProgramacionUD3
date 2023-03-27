package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.Act1;

public class MainAct1 {
    public static void main(String[] args) {
        Geometria circulo1 = new Circulo(3.1d);
        Geometria circulo2 = new Circulo(7.2d);
        Geometria circulo3 = new Circulo(1.7d);

        Geometria cuadrado1 = new Cuadrado(7d);
        Geometria cuadrado2 = new Cuadrado(14d);

        Geometria triangulo1 = new Triangulo(3d, 5d, 5d);
        Geometria triangulo2 = new Triangulo(4d, 15d, 20d);

        Geometria[] Geo = {circulo1,circulo2,cuadrado1,cuadrado2,triangulo1,triangulo2};

        System.out.println("El area total comprendida en el array es de " + calcularAreaTotal(Geo));
    }
    private static double calcularAreaTotal(Geometria[] calculoArea){
        //Variables para marcar la primera instancia de cada clase
        boolean primerCirculo = true;
        boolean primerCuadrado = true;
        boolean primerTrianguloIsos = true;

        double areaTotal = 0;
        for(int i = 0; i < calculoArea.length; i++){
            areaTotal += calculoArea[i].calcularArea();

            //Se usa instance of para comprobar que es la primera instancia de cada clase, en caso de serlo pondremos el booleano asignado en false y se coloreara en Azul como dicta el enunciado
            if (primerCirculo && calculoArea[i] instanceof Circulo){
                primerCirculo = false;
                ((Circulo) calculoArea[i]).colorear("Azul");
            }
            else if (primerCuadrado && calculoArea[i] instanceof Cuadrado){
                primerCuadrado = false;
                ((Cuadrado) calculoArea[i]).colorear("Azul");
            }
            else if (primerTrianguloIsos && calculoArea[i] instanceof Triangulo){
                primerTrianguloIsos = false;
                ((Triangulo) calculoArea[i]).colorear("Azul");
            }
        }
        return areaTotal;
    }
}
