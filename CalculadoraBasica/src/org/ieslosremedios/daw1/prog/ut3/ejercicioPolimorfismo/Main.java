package org.ieslosremedios.daw1.prog.ut3.ejercicioPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal a;
        a = new Leon();
        a.speak();
        a = new Paloma();
        a.speak();
        ((Paloma)a).fly();
    }
}
