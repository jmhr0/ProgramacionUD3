package org.ieslosremedios.daw1.prog.ut3.EjemploHerencias;

public class B extends A {
    protected String c1="amarillo";
    protected String c3;

    void Imprime () {
        System.out.println(this.c1);
        System.out.println(super.c1);

    }
    //Sobreescritura de herencia
}
