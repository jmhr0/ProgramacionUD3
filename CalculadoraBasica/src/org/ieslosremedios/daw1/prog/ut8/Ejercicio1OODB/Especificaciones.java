package org.ieslosremedios.daw1.prog.ut8.Ejercicio1OODB;

import javax.persistence.Embeddable;
import java.math.BigInteger;
import java.sql.Timestamp;

@Embeddable
public class Especificaciones {

    private BigInteger memoria;

    private BigInteger discoduro;

    private String cpu;

    private Timestamp fechacompra;

    public Especificaciones() {
    }

    public BigInteger getMemoria() {
        return memoria;
    }

    public void setMemoria(BigInteger memoria) {
        this.memoria = memoria;
    }

    public BigInteger getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(BigInteger discoduro) {
        this.discoduro = discoduro;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Timestamp getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Timestamp fechacompra) {
        this.fechacompra = fechacompra;
    }
}
