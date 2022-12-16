package org.ieslosremedios.daw1.prog.ut3.Abstractos;

public class Humano extends Animal {
    static Integer numpatas = 2;
    @Override
    void getNumPatas(){
    }

    @Override
    boolean ismamifero() {
        return super.ismamifero();
    }

    String hablar (){
        String hola = "hola";
        return hola;
    }
}
