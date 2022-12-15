package org.ieslosremedios.daw1.prog.ut3.Practica3.Ejercicio2;

public class Direccionpractica3 {
    //Ejercicio 4, clase para almacenar direcciones
    private String calle;
    private Integer numero;
    private String piso;
    private Integer codigoPostal;
    private String poblacion;
    private String localidad;
    //Ejercicio 6, constructor por defecto para que siga habiendo un constructor sin parametros

    public Direccionpractica3 (){

    }
    //Ejercicio 6, metodo para imprimir la direccion completa
    public Direccionpractica3 (String calle, Integer numero, String piso, Integer codigoPostal, String poblacion, String localidad){
        this.calle=calle;
        this.numero=numero;
        this.piso=piso;
        this.codigoPostal=codigoPostal;
        this.poblacion=poblacion;
        this.localidad=localidad;
    }
    //Ejercicio 6, sobrecarga de varios constructores para poder hacer direcciones sin provincias o codigo postal
    public Direccionpractica3 (String calle, String localidad){
        this.calle=calle;
        this.localidad=localidad;
    }
    public Direccionpractica3 (String calle, Integer numero, String piso, String poblacion, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.poblacion = poblacion;
        this.localidad = localidad;
    }
    public Direccionpractica3 (String calle, Integer numero, String piso, String poblacion) {
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