package org.ieslosremedios.daw1.prog.ut3.relacion_clases;

public class Profesor extends Persona {
    private Integer Telefono;
    private Integer CIF;

    Boolean validar (){
        return CIF !=null;
    }

    public Integer getCIF() {
        return CIF;
    }

    public void setCIF(Integer CIF) {
        this.CIF = CIF;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        this.Telefono = telefono;
    }
}
