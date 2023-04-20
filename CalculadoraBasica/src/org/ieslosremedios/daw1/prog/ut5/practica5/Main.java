package org.ieslosremedios.daw1.prog.ut5.practica5;

public class Main {
    public static void main(String[] args) {
        System.out.println("---INICIO---");
        System.out.println("--COLA--");
        Cola cola1 = new Cola();
        //Metodo encolar
        cola1.encolar("Pepe");
        cola1.encolar("Juan");
        cola1.encolar("Dani");
        cola1.encolar("Antonio");
        System.out.println(cola1);
        //Metodo desencolar, se va Pepe
        cola1.desencolar();
        System.out.println(cola1);
        //Imprimimos el primer elemento
        System.out.println("Primer elemento; ");
        cola1.frente();
        //imprimimos el resto de elementos
        System.out.println("Resto elementos;");
        cola1.resto();
        //Se vacia la cola
        cola1.limpiar();
        System.out.println(cola1);
        //comprobamos si esta vacia
        System.out.println(cola1.esVacia());
        //longitud de la cola
        cola1.longitud();
        cola1.encolar("elementopruebalongitud");
        cola1.longitud();
        System.out.println("--PILA--");
        //creamos una pila
        Pila pila1 = new Pila();
        //metodo apilar
        pila1.apilar("Pepe");
        pila1.apilar("Juan");
        pila1.apilar("Roberto");
        pila1.apilar("Alberto");
        System.out.println(pila1);
        //metodo desapilar
        pila1.desapilar();
        System.out.println(pila1);
        //metodo cima
        System.out.println(pila1.cima());
        //metodo limpiar
        pila1.limpiar();
        System.out.println(pila1);
        //metodo esVacia
        System.out.println(pila1.esVacia());
        //metodo longitud
        pila1.longitud();
        pila1.apilar("Pruebadelongitud");
        pila1.longitud();
        System.out.println("---FIN---");
    }
}
