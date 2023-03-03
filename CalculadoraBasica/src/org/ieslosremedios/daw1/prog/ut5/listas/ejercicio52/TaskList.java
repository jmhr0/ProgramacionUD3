package org.ieslosremedios.daw1.prog.ut5.listas.ejercicio52;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class TaskList {

    public List<String> tasklist;

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
        tasklist.add(task);
         System.out.println("Se ha añadido " + task);
    }
      void removeTask (String task){
        tasklist.remove(task);
          System.out.println("Se ha borrado " + task);

    }
    public void completeTask(String task) {
        int index = tasklist.indexOf(task);
        if (index >= 0) {
            tasklist.set(index, task + " ✅");
        }
    }
    public String[] getTasks() {
        return tasklist.toArray(new String[0]);
    }
}
