package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Main {
    public static void main (String[] args){
        Persona persona1 = new Persona();
        persona1.setDNI("321315661Y");

        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle nueva");

        persona1.Saludar();


    }
}
