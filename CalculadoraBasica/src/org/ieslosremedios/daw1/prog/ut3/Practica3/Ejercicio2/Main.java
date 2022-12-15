package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2;

import org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio1.Casa;

public class Main {
    public static void main(String[] args) {

        Direccionpractica3 d1 = new Direccionpractica3();
        d1.setCalle("Los naranjos");
        d1.setNumero(47);
        d1.setPiso("3ºA");
        d1.setCodigoPostal(11660);
        d1.setPoblacion("Ubrique");
        d1.setLocalidad("(Cádiz)");
        System.out.println("Vivo en la calle " + d1.getCalle() + " numero " + d1.getNumero() + " en el " + d1.getPiso() + " con codigo postal " +
                d1.getCodigoPostal() + " en " + d1.getPoblacion() + " en " + d1.getLocalidad());
        Casa c1 = new Casa();
        c1.setPrecio(30000);
        c1.setLetra('A');
        c1.setDireccionpractica3(d1);
        c1.setReferencia_catastral("4123DSVAD");

        Alumno a1 = new Alumno();
        a1.setNombre("Juanma");
        a1.setApellido1("Herrera");
        a1.setApellido2("Ramirez");
        a1.setEdad(20);
        a1.setNotaMedia(7);
        a1.setCorreoElectronico("Correodelalumno1@gmail.com");
        a1.setRepetidor(false);
        a1.setCasa(c1);
        a1.setDireccionpractica3(d1);
        System.out.println("Me llamo " + a1.getNombre() + " " + a1.getApellido1() + " " + a1.getApellido2() + " y tengo " + a1.getEdad());

        System.out.println("Con calificacion energetica de " + c1.getLetra());

        //creamos alumno 2 y le damos la nota media a alumno 1 y 2
        Alumno a2 = new Alumno();
        a2.setNombre("Jose");
        a2.setApellido1("Herrera");
        a2.setApellido2("Ramirez");
        a2.setEdad(15);
        a2.setNotaMedia(5);
        a2.setCorreoElectronico("Correodelalumno2@gmail.com");
        a2.setRepetidor(true);
        a2.setCasa(c1);
        a2.setDireccionpractica3(d1);

        //Ejercicio 8, compara las dos notas medias y da la mas alta
        System.out.println(a2.notaMedia(a1.getNotaMedia(), a2.getNotaMedia()));


    }
}
