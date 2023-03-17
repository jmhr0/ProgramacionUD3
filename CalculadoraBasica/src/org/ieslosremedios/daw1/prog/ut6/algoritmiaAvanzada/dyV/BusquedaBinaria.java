package org.ieslosremedios.daw1.prog.ut6.algoritmiaAvanzada.dyV;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5,20,25};
        System.out.println(BusquedaBinaria(test,2,0,test.length-1));
    }
    public static int BusquedaBinaria(int[] array, int num, int MinIN, int MaxIn){
        int IndexOfMid = ((MinIN + MaxIn) / 2);
        int Midnum = array[ IndexOfMid];
        if(MinIN > MaxIn){
            return -1;
        }
        if(Midnum == num){
            return  IndexOfMid;
        }
        if(num < Midnum){
            MaxIn =  (IndexOfMid - 1);
        }else{
            MinIN =  (IndexOfMid + 1);
        }
        return BusquedaBinaria(array, num, MinIN, MaxIn);
    }
}
