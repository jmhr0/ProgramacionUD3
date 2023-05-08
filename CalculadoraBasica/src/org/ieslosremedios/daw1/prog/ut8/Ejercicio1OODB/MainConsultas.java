package org.ieslosremedios.daw1.prog.ut8.Ejercicio1OODB;

import org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical.EventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class MainConsultas {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/Alumnos.odb");
        EntityManager em = emf.createEntityManager();

        TypedQuery<EventoMusical> querydinamic= em.createQuery("SELECT a FROM Alumnos a WHERE nombre LIKE ?1", EventoMusical.class);
        querydinamic.setParameter(1,"J");
        List<EventoMusical> Alumno = querydinamic.getResultList();
    }
}
