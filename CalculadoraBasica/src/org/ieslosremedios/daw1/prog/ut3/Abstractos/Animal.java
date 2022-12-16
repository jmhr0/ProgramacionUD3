package org.ieslosremedios.daw1.prog.ut3.Abstractos;

public abstract class Animal {
    final Boolean mamifero=true;
    void Adormir (){
        System.out.println("ZzzZzZ");
    }
    abstract void getNumPatas();
    boolean ismamifero(){
        return mamifero;
    }
    abstract String hablar ();

}
