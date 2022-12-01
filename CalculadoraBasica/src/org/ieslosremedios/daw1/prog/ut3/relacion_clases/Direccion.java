package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

import javax.print.attribute.IntegerSyntax;

public class Direccion {
    private Integer Numero;
    private String Calle;
    private String Ciudad;
    private String Provincia;

    Boolean validar (){
        return Numero !=null && Calle.isEmpty();
    }
    public Direccion () {
    }
    public Direccion(String Numero, String Calle, String Ciudad, String Provincia){
        this.Numero= Integer.valueOf(Numero);
        this.Calle= Calle;
        this.Ciudad= Ciudad;
        this.Provincia= Provincia;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }
}
