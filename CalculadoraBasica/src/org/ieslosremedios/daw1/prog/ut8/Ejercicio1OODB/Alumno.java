package org.ieslosremedios.daw1.prog.ut8.Ejercicio1OODB;

import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Alumno extends Persona implements Serializable {
    @Id
    @SequenceGenerator(name = "Alumno",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Alumno")
    private Integer id;

    private String grupo;

    private Ordenador ordenador;

    public Alumno() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }

    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", grupo='" + grupo + '\'' +
                ", ordenador=" + ordenador +
                '}';
    }
}

