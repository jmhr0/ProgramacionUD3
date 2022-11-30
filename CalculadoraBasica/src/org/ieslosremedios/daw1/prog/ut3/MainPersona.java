package org.ieslosremedios.daw1.prog.ut3;

public class MainPersona {
    //Get,Set,Metodos y clases
    public static void main(String[] args){

        Modelopersona Persona1 = new Modelopersona();
        Modelopersona Persona2 = new Modelopersona();
        System.out.println("Persona1");
        System.out.println("Nombre:" + Persona1.getnombre());
        System.out.println("Edad:" + Persona1.getedad());
        Persona1.setnombre("Francisco");
        System.out.println("Persona2");
        System.out.println("Nombre:" + Persona2.getnombre());
        System.out.println("Edad:" + Persona2.getedad());
        Modelopersona Persona3 = new Modelopersona("Fran","Goméz");
        Modelopersona Persona4 = new Modelopersona();
        Persona1.mayoromenosde18(20);
        System.gc();
        //garbage collector de java
    }
}
