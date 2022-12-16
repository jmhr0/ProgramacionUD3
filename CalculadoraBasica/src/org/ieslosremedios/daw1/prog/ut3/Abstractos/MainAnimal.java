package org.ieslosremedios.daw1.prog.ut3.Abstractos;

public class MainAnimal {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.hablar();
        perro1.Adormir();
        Gato gato1 = new Gato();
        gato1.hablar();
        perro1.Adormir();
        Humano humano1 = new Humano();
        humano1.hablar();
        humano1.Adormir();
    }


}
