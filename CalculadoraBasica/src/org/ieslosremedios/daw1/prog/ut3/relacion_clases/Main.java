package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Main {
    public static void main (String[] args){
        // Composicion
        Persona persona1 = new Persona();
        persona1.setDNI("321315661Y");
        persona1.setEmail("emaildepersona1@hotmail.com");

        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle nueva");
        direccion1.setNumero(71);
        direccion1.setProvincia("Cadiz");
        direccion1.setCiudad("Villamartin");


        // Herencia
        Estudiante estudiante1 = new Estudiante(13, 7.4);

        Direccion direccion2 = new Direccion();
        direccion2.setCalle("Calle nueva");
        direccion2.setNumero(53);
        direccion2.setProvincia("Cadiz");
        direccion2.setCiudad("Villamartin");
        persona1.setDireccion(direccion1);
        persona1.Saludar();
    }
}
