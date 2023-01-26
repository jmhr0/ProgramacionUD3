package org.ieslosremedios.daw1.prog.ut4.arrays.insercionDeElementos;

public class Main {
    public static void main(String[] args) {

    }
    public int[] insertar(int [] in, int e, int pos){
        int[] out = new int [in.length+1];
        for (int i = 0; i < pos; i++) {
            out[i]=in[i];
        }
        out[pos]=e;
        out[pos+1]=in[];
        return out;
    }
}
