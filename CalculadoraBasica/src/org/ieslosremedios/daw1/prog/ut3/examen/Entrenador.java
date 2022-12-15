package org.ieslosremedios.daw1.prog.ut3.examen;

public class Entrenador extends Persona {
    private char licencia;
    private String email;
    private Double sueldo;
    private Persona persona;
    private static String Campeonato="Mundial";
    private Equipo equipo;

    Entrenador(String email){

    }
    Entrenador(char licencia, String email, Double sueldo, String nombre, String dni, Integer edad, boolean sexo){
        this.licencia=licencia;
        this.email=email;
        this.sueldo=sueldo;
        super.getNombre();
        super.getDni();
        super.getEdad();
        super.getSexo();


    }

    private static void pagarIncentivo(Double sueldo){
        sueldo=sueldo*0.20;

    }
    public void pagarFiniquito(){
        Integer sueldo=0;
    }

    public char getLicencia() {
        return licencia;
    }

    public void setLicencia(char licencia) {
        this.licencia = licencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
