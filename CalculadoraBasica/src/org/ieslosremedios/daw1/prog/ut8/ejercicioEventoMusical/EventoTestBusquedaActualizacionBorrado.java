package org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical;

import javax.persistence.*;
import java.util.List;

public class EventoTestBusquedaActualizacionBorrado {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventoMusical.odb");
        EntityManager em = emf.createEntityManager();


        EventoMusical eventoMusical = em.find(EventoMusical.class,12);
        System.out.println("recaudacion: " + eventoMusical.getRecaudacion());
        //JPQL
        //estatico
        TypedQuery<EventoMusical> querystatic= em.createNamedQuery("queryEstaticaBusqueda", EventoMusical.class);
        querystatic.setParameter(1,"evento1");
        List<EventoMusical> eventoMusical1 = querystatic.getResultList();
        System.out.println(eventoMusical1);

        //dinamico
        TypedQuery<EventoMusical> querydinamic= em.createQuery("SELECT e FROM EventoMusical e WHERE id = ?1", EventoMusical.class);
        querydinamic.setParameter(1,11);
        EventoMusical eventoMusical2 = querydinamic.getSingleResult();
        System.out.println(eventoMusical2);


        em.getTransaction().begin();
        //Actualización
        EventoMusical EventoToUpdate = em.find(EventoMusical.class,1);
        EventoToUpdate.setNombre("Evento1");
        //con JPQL
        //estatico
        TypedQuery<EventoMusical> querystaticUPDATE= em.createNamedQuery("queryEstaticaActualizacion", EventoMusical.class);
        querystaticUPDATE.setParameter(1,1);
        //dinamico
        TypedQuery<EventoMusical> querydinamicUPDATE= em.createQuery("UPDATE EventoMusical SET nombre = 'Evento1' WHERE id = ?1", EventoMusical.class);
        querydinamicUPDATE.setParameter(1,1);
        em.getTransaction().commit();
        //Borrado
        em.getTransaction().begin();
        EventoMusical EventoToDelete = em.find(EventoMusical.class,2);
        em.remove(EventoToDelete);
        //JPQL
        TypedQuery<EventoMusical> querystaticDELETE= em.createNamedQuery("queryEstaticaBorrado", EventoMusical.class);
        querystaticDELETE.setParameter(1,"evento2");

        TypedQuery<EventoMusical> querydinamycDELETE= em.createQuery("DELETE FROM EventoMusical WHERE id = :id", EventoMusical.class);
        querydinamycDELETE.setParameter("id","42");

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
