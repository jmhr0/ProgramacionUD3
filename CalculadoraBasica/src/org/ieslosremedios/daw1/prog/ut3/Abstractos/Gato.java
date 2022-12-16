package org.ieslosremedios.daw1.prog.ut3.Abstractos;

public class Gato extends Animal {
    static Integer NUMPATA = 4;
    @Override
    void getNumPatas() {

    }
    @Override
    boolean ismamifero() {
        return super.ismamifero();
    }

    @Override
    String hablar (){
        String hablar = "Miau";
        return hablar;
    }
}
