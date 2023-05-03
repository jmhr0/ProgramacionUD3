package org.ieslosremedios.daw1.prog.ut8.conexionaBD;

import org.ieslosremedios.daw1.prog.ut8.Coche;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EjemploConexion {
    public static void main(String[] args) {
    // Abrir conexión
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
    EntityManager em = emf.createEntityManager();

    // Iniciar la transacción
        em.getTransaction().begin();

    // Operaciones
    Coche c1 = new Coche();
        c1.setColor("Rojo");

    Coche c2 = new Coche();
        c2.setColor("Verde");

        em.persist(c1);
        em.persist(c2);

    // Finalizar la transacción: salvar la información
        em.getTransaction().commit();

    // Cerrar conexión
        em.close();
        emf.close();

}
}
