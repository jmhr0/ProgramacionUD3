package org.ieslosremedios.daw1.prog.ut8;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        //abrir conexion
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //operaciones
        Coche c1 = new Coche();
        c1.setColor("rojo");
        Coche c2 = new Coche();
        c2.setColor("verde");

        //salvar la informacion
        em.getTransaction().commit();

        em.persist(c1);
        em.persist(c2);
        //cerrar conexion
    }
}
