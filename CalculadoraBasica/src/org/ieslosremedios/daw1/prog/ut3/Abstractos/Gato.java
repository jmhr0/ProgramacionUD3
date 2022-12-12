package org.ieslosremedios.daw1.prog.ut3.Abstractos;

public class Gato extends Animal {
    final static Integer NUMPATA = 4;
    @Override
    void getNumPatas() {
        return NUMPATA;
    }

    @Override
    boolean ismamifero() {
        return super.ismamifero();
    }
}
