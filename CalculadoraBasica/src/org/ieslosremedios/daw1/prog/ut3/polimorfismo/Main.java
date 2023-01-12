package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class Main {
    public static void main(String[] args) {
        SuperClase a;

        a = new SubClaseB();
        a.metodo();
        a = new SubClaseA();
        a.metodo();
        a = new SuperClase();
        a.metodo();
    }
}
