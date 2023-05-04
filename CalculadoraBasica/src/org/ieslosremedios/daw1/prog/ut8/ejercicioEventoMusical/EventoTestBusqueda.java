package org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical;

import javax.persistence.*;
import java.util.List;

public class EventoTestBusqueda {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventoMusical.odb");
        EntityManager em = emf.createEntityManager();


        EventoMusical eventoMusical = em.find(EventoMusical.class,12);
        System.out.println("recaudacion: " + eventoMusical.getRecaudacion());
        // O

        //estatico
        TypedQuery<EventoMusical> querystatic= em.createNamedQuery("queryEstatica", EventoMusical.class);
        querystatic.setParameter(1,"evento1");
        List<EventoMusical> eventoMusical1 = querystatic.getResultList();
        System.out.println(eventoMusical1);

        //dinamico
        TypedQuery<EventoMusical> querydinamic= em.createQuery("SELECT e FROM EventoMusical e WHERE id = ?1", EventoMusical.class);
        querydinamic.setParameter(1,11);
        EventoMusical eventoMusical2 = querydinamic.getSingleResult();
        System.out.println(eventoMusical2);

        //Actualización
        em.getTransaction().begin();
        em.close();

    }
}
