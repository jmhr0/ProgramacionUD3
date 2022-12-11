package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2;

import org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1.Casa;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setNombre("Juanma");
        a1.setApellido1("Herrera");
        a1.setApellido2("Ramirez");
        a1.setEdad(20);
        System.out.println("Me llamo " + a1.getNombre() + " " + a1.getApellido1() + " " + a1.getApellido2()+ " y tengo " + a1.getEdad());

        Direccionpractica3 d1 = new Direccionpractica3();
        d1.setCalle("Los naranjos");
        d1.setNumero(47);
        d1.setPiso("3ºA");
        d1.setCodigoPostal(11660);
        d1.setPoblacion("Ubrique");
        d1.setLocalidad("(Cádiz)");
        System.out.println("Vivo en la calle "+ d1.getCalle() + " numero " + d1.getNumero() + " en el " + d1.getPiso() + " con codigo postal" +
        d1.getCodigoPostal() + "en" + d1.getPoblacion() + "en" + d1.getLocalidad());

        Alumno a2 = new Alumno();
        a1.setNotaMedia(5.6);
        a2.setNotaMedia(6.3);


        Casa c1 = new Casa();
        c1.setLetra('A');
        System.out.println("Con calificacion energetica de" + c1.getLetra());}
}
