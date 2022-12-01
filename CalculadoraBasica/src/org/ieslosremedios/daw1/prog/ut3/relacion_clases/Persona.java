package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Persona {
    private String DNI;
    private String Email;

    public Persona() {

    }
    public Persona(String DNI, String Email) {
        this.DNI= DNI;
        this.Email= Email;
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

    public String Saludar () {
        return "Hola" + DNI;
    }
}
