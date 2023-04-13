package org.ieslosremedios.daw1.prog.ut6.practica6.ej2;

public class TorresHanoi {
    public static void main(String[] args) {
        int numDiscos = 3; // Numero de discos a mover
        moverDiscos(numDiscos, 'A', 'B', 'C');
    }

    public static void moverDiscos(int numDiscos, char torreInicial, char torreFinal, char torreAuxiliar) {
        if (numDiscos == 1) {           //Si solo hay un disco, el programa mueve ese disco directamente de la torre inicial a la torre final
            System.out.println("Mover disco 1 desde " + torreInicial + " hasta " + torreFinal);
        } else { //Si hay más de un disco, la función llama a sí misma recursivamente para mover los discos más pequeños de la torre inicial a la torre auxiliar, utilizando la torre final como torre auxiliar. Luego, mueve el disco más grande de la torre inicial a la torre final. Finalmente, la función llama a sí misma recursivamente para mover los discos más pequeños de la torre auxiliar a la torre final, utilizando la torre inicial como torre auxiliar.
                //La recursión continúa hasta que solo queda un disco, momento en el cual la función mueve ese disco directamente a la torre final.
            moverDiscos(numDiscos-1, torreInicial, torreAuxiliar, torreFinal);
            System.out.println("Mover disco " + numDiscos + " desde " + torreInicial + " hasta " + torreFinal);
            moverDiscos(numDiscos-1, torreAuxiliar, torreFinal, torreInicial);
        }
    }
}