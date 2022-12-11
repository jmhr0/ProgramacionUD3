package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2;

public class Direccionpractica3 {
    protected String calle = "Los Naranjos";
    protected Integer numero = 47;
    protected String piso = "3ºA";
    protected Integer codigoPostal = 11660;
    protected String poblacion = "Ubrique";
    protected String localidad = "(Cádiz)";

    protected Direccionpractica3 (){

    }
    protected Direccionpractica3 (String calle, Integer numero, String piso, Integer codigoPostal, String poblacion, String localidad){
        this.calle=calle;
        this.numero=numero;
        this.piso=piso;
        this.codigoPostal=codigoPostal;
        this.poblacion=poblacion;
        this.localidad=localidad;
    }
    protected Direccionpractica3 (String calle, String localidad){
        this.calle=calle;
        this.localidad=localidad;
    }
    protected Direccionpractica3 (String calle, Integer numero, String piso, String poblacion, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.poblacion = poblacion;
        this.localidad = localidad;
    }
    protected Direccionpractica3 (String calle, Integer numero, String piso, String poblacion) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.poblacion = poblacion;
    }
    void imprimir_todo(String calle, Integer numero, String piso, Integer codigoPostal, String pueblo, String localidad) {
        System.out.println("La direccion de este alumno es: " + calle + " ," + numero + " ," + codigoPostal + " " + pueblo + localidad);
    }

    void imprimir_calle_localidad(String calle,String localidad) {
        System.out.println("La direccion de este alumno es: " + calle + localidad);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}