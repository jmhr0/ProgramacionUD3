package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1;

import org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2.Direccionpractica3;

//Ejercicio 1, clase con visibilidad publica
public class Casa {
    //Ejercicio 1, campo tipo numerico para el precio
    private int precio;
    //Ejercicio 1, campo tipo caracter para la calificacion energetica
    private char letra;

    //Ejercicio 1, campo tipo cadena para la referencia catastral
    private String referencia_catastral;
    //Ejercicio 1, constantes para el iva y iva reducido, por defecto 21 y 16 respectivamente
    private final Integer IVA = 21 / 100;
    private final Integer IVA_reduc = 16 / 100;
    //añadimos relacion de composicion con la direccion como pide el ejercicio 4
    private Direccionpractica3 direccionpractica3;

    //Ejercicio 1, metodos para el calculo del iva y iva reducido
    void precio_IVA(int precio, Integer IVA) {
        precio = this.precio * (IVA);
        System.out.println("El precio con IVA es: " + precio);
    }

    void precio_IVAreduc(int precio, Integer IVA_reducido) {
        precio = this.precio * (IVA_reducido);
        System.out.println("El precio con un IVA reducido es: " + precio);
    }

    //Ejercicio 1, metodo imprimir_todo solo accesible desde el mismo paquete (al no poner nada por defecto obtiene la visibilidad package)
    void Imprimir_todo(int precio, Integer IVA, Integer IVA_reducido, String referencia_castastral) {
        System.out.println("El precio sin IVA es" + this.precio);
        System.out.println("La referencia catastral es: " + referencia_catastral);
        System.out.println("El precio con un IVA reducido es: " + this.precio * this.IVA_reduc);
        System.out.println("El precio con IVA es: " + this.precio * this.IVA);

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getReferencia_catastral() {
        return referencia_catastral;
    }

    public void setReferencia_catastral(String referencia_catastral) {
        this.referencia_catastral = referencia_catastral;
    }

    public Direccionpractica3 getDireccionpractica3() {
        return direccionpractica3;
    }

    public void setDireccionpractica3(Direccionpractica3 direccionpractica3) {
        this.direccionpractica3 = direccionpractica3;
    }
}