package org.ieslosremedios.daw1.prog.ut3.ejercicioPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal a;
        Instrumento b;
        a = new Leon();
        a.speak();
        a = new Paloma();
        a.speak();
        ((Paloma)a).fly();
        b = new Guitarra();
        b.tocar();
        b = new Tambor();
        b.tocar();
    }
}
