package org.ieslosremedios.daw1.prog.ut4.arrays.recorrerUnArray;
import java.util.Arrays;

public class ImpresionRecorridoBidimensional {
    public static void main(String[] args) {
        String[][] enteros2 = {{"A","B","C"},{"E","F","G"},{"H","I","J"}};
        for (int i = 0; i <= enteros2.length - 1; i++){
            System.out.print(Arrays.toString(enteros2[i]));
        }

        for (int i = 0; i <= enteros2.length - 1; i++){
            for (int j = 0 ; j < enteros2[i].length; j++) {
                System.out.print(enteros2[i][j]);
            }
        }
        int z=0;
        while (z<=enteros2.length - 1){
            int x=0;
            while (x < enteros2[z].length){
                x++;
                System.out.println(enteros2[z][x]);
            }
            z++;
        }

    }
}
