package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1;

import org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2.Direccionpractica3;

public class Casa {
    //campo tipo numerico para el precio
    protected int precio;
    //campo tipo caracter para la calificacion energetica
    protected char letra;
    //campo tipo cadena para la referencia catastral
    protected String referencia_catastral;
    //constantes para el iva y iva reducido
    protected final Integer IVA = 21/100 ;
    protected final Integer IVA_reduc = 16/100 ;
    //añadimos relacion de composicion con la direccion como pide el ejercicio 4
    protected Direccionpractica3 direccionpractica3;
    //metodos para el calculo del iva y iva reducido
    void precio_IVA (int precio, Integer IVA) {
        precio = this.precio * (IVA);
        System.out.println("El precio con IVA es: " + precio);
    }
    void precio_IVAreduc (int precio, Integer IVA_reducido) {
        precio = this.precio * (IVA_reducido);
        System.out.println("El precio con un IVA reducido es: " + precio);
    }
    void Imprimir_todo (int precio, Integer IVA, Integer IVA_reducido, String referencia_castastral){
        precio=this.precio;
        System.out.println("La referencia catastral es: " + referencia_catastral);
        System.out.println("El precio con un IVA reducido es: " + precio * this.IVA_reduc);
        System.out.println("El precio con IVA es: " + precio * this.IVA);

}
    public Casa(){
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}