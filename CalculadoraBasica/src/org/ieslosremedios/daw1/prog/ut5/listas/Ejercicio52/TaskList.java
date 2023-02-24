package org.ieslosremedios.daw1.prog.ut5.listas.Ejercicio52;

import java.util.List;
public class TaskList {
    static void addTask (List<String> ListaTarea, String task){
        ListaTarea.add(task);
    }
    static  void removeTask (List<String> ListaTarea, String task){
        ListaTarea.remove(task);

    }
    static  void completeTask (List<String> ListaTarea, String task){
        System.out.println("La tarea " + task + " Ha sido completada");
        ListaTarea.remove(task);
    }
    static  void getTasks(List<String> ListaTarea){

        System.out.println(ListaTarea);
    }
}
