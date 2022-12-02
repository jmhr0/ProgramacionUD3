package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Persona {
    private String DNI;
    private String Email;

    public Persona() {

    }
    public Persona(String DNI, String Email) {
        this.DNI = DNI;
        this.Email = Email;
    }
    public void Saludar (){
        System.out.println("Hola, mi DNI es "+ DNI + " Y mi email es " + Email );
    }
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDireccion(Direccion direccion1) {
    }
}
