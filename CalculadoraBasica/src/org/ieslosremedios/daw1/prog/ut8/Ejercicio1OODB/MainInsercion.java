package org.ieslosremedios.daw1.prog.ut8.Ejercicio1OODB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainInsercion {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/Alumnos");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Ordenador pc1= new Ordenador();
        Ordenador pc2= new Ordenador();
        Ordenador pc3= new Ordenador();
        Ordenador pc4= new Ordenador();
        Ordenador pc5= new Ordenador();
        Ordenador pc6= new Ordenador();
        Ordenador pc7= new Ordenador();
        Ordenador pc8= new Ordenador();
        Ordenador pc9= new Ordenador();
        pc1.setIP("192.320.329");

        pc2.setIP("192.320.330");
        pc3.setIP("192.320.331");
        pc4.setIP("192.320.332");
        pc5.setIP("192.320.333");
        pc6.setIP("192.320.334");
        pc7.setIP("192.320.335");
        pc8.setIP("192.320.336");
        pc9.setIP("192.320.336");

        Alumno Fran = new Alumno();
        Fran.setNombre("Fran");
        Fran.setGrupo("1ºDAW");
        Alumno Victor = new Alumno();
        Victor.setNombre("Victor");
        Victor.setGrupo("1ºDAW");
        Alumno John = new Alumno();
        John.setNombre("John");
        John.setGrupo("1ºDAW");
        Alumno Jorge = new Alumno();
        Jorge.setNombre("Jorge");
        Jorge.setGrupo("1ºDAW");
        Jorge.setOrdenador(pc9);
        Alumno Julian = new Alumno();
        Julian.setNombre("Julian");
        Julian.setGrupo("1ºDAW");
        Julian.setOrdenador(pc8);
        Alumno Diego = new Alumno();
        Diego.setNombre("Diego");
        Diego.setGrupo("1ºDAW");
        Diego.setOrdenador(pc7);
        Alumno David = new Alumno();
        David.setNombre("David");
        David.setGrupo("1ºDAW");
        Alumno JuanmaH = new Alumno();
        JuanmaH.setNombre("JuanmaH");
        JuanmaH.setGrupo("1ºDAW");
        JuanmaH.setOrdenador(pc5);
        Alumno Jonathan = new Alumno();
        Jonathan.setNombre("Jonathan");
        Jonathan.setGrupo("1ºDAW");
        Jonathan.setOrdenador(pc6);
        Alumno Pablo = new Alumno();
        Pablo.setNombre("Pablo");
        Pablo.setGrupo("1ºDAW");
        Pablo.setOrdenador(pc4);
        Alumno JuanMaria = new Alumno();
        JuanMaria.setNombre("JuanMaria");
        JuanMaria.setGrupo("1ºDAW");
        JuanMaria.setOrdenador(pc3);
        Alumno Adrian = new Alumno();
        Adrian.setNombre("Adrian");
        Adrian.setGrupo("1ºDAW");
        Alumno Ricardo = new Alumno();
        Ricardo.setNombre("Ricardo");
        Ricardo.setGrupo("1ºDAW");
        Alumno JuanJesus = new Alumno();
        JuanJesus.setNombre("JuanJesus");
        JuanJesus.setGrupo("1ºDAW");
        Alumno Pepe = new Alumno();
        Pepe.setNombre("Pepe");
        Pepe.setGrupo("1ºDAW");
        Alumno Dani = new Alumno();
        Dani.setNombre("Dani");
        Dani.setGrupo("1ºDAW");
        Dani.setOrdenador(pc2);
        Alumno JuanmaSab = new Alumno();
        JuanmaSab.setNombre("JuanmaSab");
        JuanmaSab.setGrupo("1ºDAW");
        JuanmaSab.setOrdenador(pc1);
        Alumno Antonio = new Alumno();
        Antonio.setNombre("Anton");
        Antonio.setGrupo("1ºDAW");
        Alumno Jossie = new Alumno();
        Jossie.setNombre("Jossie");
        Jossie.setGrupo("1ºDAW");


        em.persist(pc1);
        em.persist(pc2);
        em.persist(pc3);
        em.persist(pc4);
        em.persist(pc5);
        em.persist(pc6);
        em.persist(pc7);
        em.persist(pc8);
        em.persist(pc9);

        em.persist(Antonio);
        em.persist(Diego);
        em.persist(Dani);
        em.persist(Fran);
        em.persist(Pablo);
        em.persist(Ricardo);
        em.persist(Adrian);
        em.persist(David);
        em.persist(Victor);
        em.persist(Pepe);
        em.persist(Julian);
        em.persist(John);
        em.persist(Jonathan);
        em.persist(Jorge);
        em.persist(Jossie);
        em.persist(JuanJesus);
        em.persist(JuanmaSab);
        em.persist(JuanMaria);

        em.getTransaction().commit();
    }
}
