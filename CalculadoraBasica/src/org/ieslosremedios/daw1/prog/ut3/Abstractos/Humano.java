package org.ieslosremedios.daw1.prog.ut3.Abstractos;

public class Humano extends Animal {
    final static Integer numpatas = 2;
    @Override
    void getNumPatas() {
        return this.numpatas;
    }

    @Override
    boolean ismamifero() {
        return super.ismamifero();
    }
}
