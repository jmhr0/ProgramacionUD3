package org.ieslosremedios.daw1.prog.ut8.Ejercicio1OODB;

import javax.persistence.*;

@Entity

public class Ordenador {
    @Id
    @SequenceGenerator(name = "Ordenador",initialValue = 1,allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Ordenador")
    private Integer id;
    private String IP;
    private Integer numeroSerie;
    private Especificaciones especificaciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(Especificaciones especificaciones) {
        this.especificaciones = especificaciones;
    }

    public Ordenador(Integer id, String IP, Integer numeroSerie, Especificaciones especificaciones) {
        this.id = id;
        this.IP = IP;
        this.numeroSerie = numeroSerie;
        this.especificaciones = especificaciones;
    }

    public Ordenador() {
    }
}
