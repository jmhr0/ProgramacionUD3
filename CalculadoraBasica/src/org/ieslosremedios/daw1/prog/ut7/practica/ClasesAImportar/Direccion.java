package org.ieslosremedios.daw1.prog.ut7.practica.ClasesAImportar;

import java.io.Serializable;

public class Direccion implements Serializable {
    public String pais;
    public String localidad;
    public String calle;
    public int numero;

    public Direccion(String pais, String localidad, String calle, int numero) {
        this.pais = pais;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }

    public Direccion() {}

    public Direccion(String calle) {
        this.calle = calle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return getCalle();
    }
}
