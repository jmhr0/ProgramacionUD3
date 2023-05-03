package org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

public class EventoMusical implements Serializable {

    @Id
    @SequenceGenerator(name = "10en10",allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "10en10")
    private Integer id;
    private String nombre;
    private Date fecha;
    private BigInteger recaudacion;

    @Enumerated(EnumType.ORDINAL)
    private Generos generos;
    @Embedded
    private List<Artista> artistas;
    @Transient // O usar modificador transient
    private int control;

    public EventoMusical(Integer id, String nombre, Date fecha, BigInteger recaudacion, Generos generos, List<Artista> artistas, int control) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.generos = generos;
        this.artistas = artistas;
        this.control = control;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Generos getGeneros() {
        return generos;
    }

    public void setGeneros(Generos generos) {
        this.generos = generos;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public EventoMusical() {
    }

    public EventoMusical(String nombre, Date fecha, BigInteger recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }
    public EventoMusical(String nombre, Date fecha, BigInteger recaudacion, Generos generos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.generos = generos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigInteger recaudacion) {
        this.recaudacion = recaudacion;
    }

    //Conviene usar BigInteger-BigDecimal cuando sepamos con certeza que el numero a almacenar sera muy grande

    //Date
    //Time
    //TimeStamp
    //Calendar
}

