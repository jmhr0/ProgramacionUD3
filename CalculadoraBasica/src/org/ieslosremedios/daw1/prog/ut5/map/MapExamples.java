package org.ieslosremedios.daw1.prog.ut5.map;

import org.ieslosremedios.daw1.prog.ut5.conjuntos.ejercicio51.Persona;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map <Integer,Object> m = new HashMap();
        //se le puede incluir cualquier tipo de valor a un map
        m.put(1,new Persona());
        m.put(2,1);
        m.put(3,"Hola");
        //Se pueden crear hashmaps
        //Crear un abecedario hasta la E y almacenarlo en un map
        Map <Integer,String> abecedario = new HashMap();
        abecedario.put(1,"A");
        abecedario.put(2,"B");
        abecedario.put(3,"C");
        abecedario.put(4,"D");
        abecedario.put(5,"E");
        //metodo get, devuelve lo que hay en la posicion
        System.out.println(abecedario.get(3));

        System.out.println(abecedario);
        //metodo replace, modifica lo que hay en la posicion por lo que especifiquemo0s
        abecedario.replace(4,"F");
        System.out.println(abecedario);
        //metodo remove, elimina la posicion que especifiquemos
        System.out.println("El elemento eliminado es: " + abecedario.remove(4));
        System.out.println(abecedario);
        //metodo containsvalue para saber si el valor propuesto esta en el map, se usa exclamacion para ''negar''
        if (!abecedario.containsValue("F")){
            System.out.println("La letra: F no esta en el map");
        } else {
            System.out.println("La letra: F esta en el map");
        }
        //metodo containsKey, igual que el metodo containsvalue, pero para las claves
        if (!abecedario.containsKey(1)){
            System.out.println("La clave: 1 no esta en el map");
        } else {
            System.out.println("La clave: 1 esta en el map");
        }
        //Iterando sobre el conjunto de valores, es necesario meterlo dentro de una collection para poder crear un
        //iterador
        Iterator it = abecedario.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        it=abecedario.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(abecedario);
        System.out.println(abecedario.isEmpty());
        System.out.println(abecedario.size());
        //metodo clear, elimina lo que hay en todas las posiciones
        abecedario.clear();
        System.out.println(abecedario);
        System.out.println(abecedario.isEmpty());
        abecedario.put(null,"Z");
        abecedario.put(null,null);
        abecedario.put(null,"X");
        abecedario.put(9,"X");
        System.out.println(abecedario);


       // LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        // lhm.putAll(abecedario);
        // System.out.println(abecedario.values());


        //En un treemap, siempre estara ordenado alfabeticamente o segun el orden natural
        TreeMap <Integer,String> notas= new TreeMap<>();
        notas.put(1,"Insuficiente");
        notas.put(2,"Insuficiente");
        notas.put(10,"Sobresaliente");
        notas.put(3,"Insuficiente");
        notas.put(8,"Notable");
        notas.put(5,"suficiente");
        notas.put(6,"Bien");
        notas.put(7,"Notable");
        notas.put(4,"Insuficiente");
        notas.put(9,"Sobresaliente");
        System.out.println(notas);
    }
}
