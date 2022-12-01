package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Direccion {
    private String Numero;
    private String Calle;
    private String Ciudad;
    private String Provincia;

    Boolean validar (){
        return Numero !=null && Calle.isEmpty();
    }
    public Direccion () {
    }
    public Direccion(String Numero, String Calle, String Ciudad, String Provincia){
        this.Numero= Numero;
        this.Calle= Calle;
        this.Ciudad= Ciudad;
        this.Provincia= Provincia;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
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
