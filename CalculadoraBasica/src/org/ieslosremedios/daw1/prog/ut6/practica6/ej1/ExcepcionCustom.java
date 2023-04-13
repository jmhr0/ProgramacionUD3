package org.ieslosremedios.daw1.prog.ut6.practica6.ej1;

public class ExcepcionCustom extends Exception {
    public ExcepcionCustom(String mensaje, ArithmeticException e) {
        super(mensaje);
    }
}
