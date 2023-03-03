package org.ieslosremedios.daw1.prog.ut5.listas.ejercicio52;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main52 {
    public static void main(String[] args) {
        String tipolista="LinkedList";

        TaskList listaTareas = new TaskList(tipolista);

        listaTareas.addTask("Estudiar");
        listaTareas.addTask("Comer");
        listaTareas.addTask("Lavar la ropa");

        listaTareas.removeTask("Lavar la ropa");

        listaTareas.completeTask("Comer");

        String[] tareas = listaTareas.getTasks();
    }
}
