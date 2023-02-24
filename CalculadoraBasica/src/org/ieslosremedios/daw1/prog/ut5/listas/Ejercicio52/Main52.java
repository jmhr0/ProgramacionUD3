package org.ieslosremedios.daw1.prog.ut5.listas.Ejercicio52;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main52 extends TaskList {
    public static void main(String[] args) {

        LinkedList listaenlazada = new LinkedList();
        ArrayList listaArray = new ArrayList();

        addTask(listaenlazada,"Tomates");
        addTask(listaenlazada,"Cebollas");
        addTask(listaenlazada,"Lechuga");

        addTask(listaArray,"Naranja");
        addTask(listaArray,"Platano");
        addTask(listaArray,"Manzanas");

        removeTask(listaenlazada,"Tomates");
        removeTask(listaArray,"Naranja");

        completeTask(listaenlazada, "Manzanas");
        completeTask(listaenlazada, "Cebollas");

        getTasks(listaArray);
        getTasks(listaenlazada);
    }
}
