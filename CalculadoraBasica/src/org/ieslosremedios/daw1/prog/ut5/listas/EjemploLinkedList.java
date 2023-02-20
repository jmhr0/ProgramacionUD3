package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(3);
        numbers.add(23);
        numbers.add(15);
        numbers.add(12);
        numbers.add(17);
        List<Integer> linkedList = new LinkedList<>(numbers);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(10);

        //el 77 solo aparece en numbers ya que se ha añadido despues de que la linkedlist haga la copia como base de numbers
        numbers.add(77);

        System.out.println("Arraylist " + numbers);

        System.out.println("Linkedlist " + linkedList);
        //recorrer lista en orden inverso
        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size());
        Integer e;
        System.out.print("[");
        while (listIterator.hasPrevious()){
            e = listIterator.previous();
            if (e.equals(15)) {
                listIterator.remove();
            }
            //añadir 11 entre 23 y 15
            if (e.equals(23)) {
                listIterator.add(11);
            }
            System.out.print(e);
            if (listIterator.hasPrevious()){
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("Linkedlist " + linkedList);
        //obtener el elemento 3 de la lista
        System.out.println(linkedList.get(2));
        // modifica lo que se halle en el indice numero 4 por el numero 22
        linkedList.set(4,22);
        System.out.println(linkedList);
        //Mostrar si el numero 22 esta en la lista
        System.out.println(linkedList.contains(22));
        //Mostrar el indice en el que se encuentra el numero 22
        System.out.println(linkedList.indexOf(22));
        //Eliminar el elemento 22
        linkedList.remove(linkedList.indexOf(22));
        System.out.println(linkedList.contains(22));
        linkedList.add(9);
        System.out.println(linkedList);
    }
}
