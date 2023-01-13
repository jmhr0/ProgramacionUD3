package org.ieslosremedios.daw1.prog.ut3.ejercicioPolimorfismo;

public class Paloma extends Animal implements Flyable {

    public void fly() {
        System.out.println("Voy volando");
    }
    @Override
    public void speak(){
        System.out.println("Ruu");
    }

}
