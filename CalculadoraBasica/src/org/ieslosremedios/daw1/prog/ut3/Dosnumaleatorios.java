package org.ieslosremedios.daw1.prog.ut3;
import java.util.Random;

public class Dosnumaleatorios {
    public static void main(String[] args) {
        Random utilRandom = new Random();
        int aleatorio1 = utilRandom.nextInt(100);
        System.out.println(aleatorio1);

        int variable1 = Math.max(1, 5);
        System.out.println(variable1);
    }
}