package org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigInteger;
import java.sql.Date;

public class EventoTestCreacion {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventoMusical.odb");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();


        EventoMusical a = new EventoMusical("evento1", new Date(2022,5,1),new BigInteger("2000"));

        EventoMusical b = new EventoMusical("evento2", new Date(2022,5,1),new BigInteger("7240"));
        em.persist(a);
        em.persist(b);

        em.getTransaction().commit();




        em.close();
        emf.close();
    }
}
