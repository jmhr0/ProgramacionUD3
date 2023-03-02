package org.ieslosremedios.daw1.prog.ut5.listas.ejercicio52;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class TaskList {

    public List<Integer> tasklist;

    public TaskList(String s){
        if (s=="Arraylist")
        { tasklist=new ArrayList<>();

        }
        if (s=="Linkedlist"){tasklist= new LinkedList<>();
        } else {
            System.out.println("El valor no existe");
        }
    }
     void addTask (String task){
        taskList.add(task);
         System.out.println("Se ha añadido " + task);
    }
      void removeTask (String task){
        taskList.remove(task);
          System.out.println("Se ha borrado " + task);

    }
      void completeTask (String task){
        System.out.println("La tarea " + task + " Ha sido completada");
        taskList.remove(task);
    }
      void getTasks(List<String> taskList){
        taskList.toArray();
    }
}
