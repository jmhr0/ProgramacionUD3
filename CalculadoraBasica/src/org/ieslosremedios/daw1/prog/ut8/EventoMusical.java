package org.ieslosremedios.daw1.prog.ut8;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

public class EventoMusical implements Serializable {
    private String nombre;
    private Date fecha;
    private BigInteger recaudacion;

    public EventoMusical() {
    }

    public EventoMusical(String nombre, Date fecha, BigInteger recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
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
    //Conviene usar BigInteger cuando sepamos con certeza que el numero a almacenar sera muy grande

    //Date
    //Time
    //TimeStamp
    //Calendar
}

