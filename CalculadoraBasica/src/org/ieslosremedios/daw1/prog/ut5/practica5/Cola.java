package org.ieslosremedios.daw1.prog.ut5.practica5;

import java.util.LinkedList;
import java.util.List;

public class Cola {
    private List cola = new LinkedList<>();

    public void encolar(Object s){
        cola.add(s);
    }

    @Override
    public String toString() {
        return "Cola{" +
                "cola=" + cola +
                '}';
    }
}
