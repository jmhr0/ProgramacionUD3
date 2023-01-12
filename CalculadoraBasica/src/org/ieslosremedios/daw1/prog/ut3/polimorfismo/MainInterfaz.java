package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class MainInterfaz {
    public static void main(String[] args) {
        Interfaz s;

        s = new ImplementacionA();
        s.metodo();
        s = new ImplementacionB();
        s.metodo();
    }
}