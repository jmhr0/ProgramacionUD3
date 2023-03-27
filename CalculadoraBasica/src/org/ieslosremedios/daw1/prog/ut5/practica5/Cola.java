package org.ieslosremedios.daw1.prog.ut5.practica5;

import java.util.LinkedList;
import java.util.List;

public class Cola {
    private List cola = new LinkedList<>();

    public void encolar(Object elemento){
        cola.add(elemento);
    }

    public void desencolar(){ cola.remove(0); }

    public void frente(){
        System.out.println(cola.get(0));;
    }

    public void resto (){
        for(int i = 1; i < cola.size(); i++){
            System.out.print(cola.get(i) + " ");
        }
    }

    public void limpiar (){
        cola.clear();
    }

    public boolean esVacia (){
        return cola.isEmpty();
    }

    public void longitud (){
        System.out.println(cola.size());
    }

    @Override
    public String toString() {
        return cola.toString();
    }
}