package org.ieslosremedios.daw1.prog.ut5.practica5;

import java.util.LinkedList;
import java.util.List;

public class Pila {
    private List<String> pila = new LinkedList<String>();

    public void apilar(String persona){
        pila.add(persona);
    }

    public void desapilar(){
        pila.remove(pila.size() - 1);
    }

    public String cima(){
        return (pila.get(pila.size() - 1));
    }

    public void limpiar(){
        pila.clear();
    }

    public boolean esVacia(){
        return pila.isEmpty();
    }

    public int longitud(){
        return (pila.size());
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}