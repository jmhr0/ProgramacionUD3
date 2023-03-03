package org.ieslosremedios.daw1.prog.ut5.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio53 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 1, 1, 3, 4, 5, 2, 2, 6, 7, 7, 8};

        contador(numbers);
    }

    public static void contador(Integer[] ArrayAContar) {
        Map<Integer, Integer> mapaContador = new TreeMap<Integer, Integer>();
        for (int i = 0; i < ArrayAContar.length; i++) {
            int num = ArrayAContar[i];
            if (mapaContador.containsKey(num)) {
                int counter = mapaContador.get(num);
                counter = counter + 1;
                mapaContador.put(num, counter);
            } else {
                mapaContador.put(num, 1);
            }
        }

            Iterator<Integer> itElementos = mapaContador.keySet().iterator();
            while(itElementos.hasNext()){
                Integer key = itElementos.next();
                System.out.println("El número " + key + " está " + mapaContador.get(key) + " veces");
            }

            }
        }