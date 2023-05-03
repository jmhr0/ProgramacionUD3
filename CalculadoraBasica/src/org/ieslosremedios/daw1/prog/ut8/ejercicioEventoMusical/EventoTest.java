package org.ieslosremedios.daw1.prog.ut8.ejercicioEventoMusical;

import java.math.BigInteger;
import java.sql.Date;

public class EventoTest {
    public static void main(String[] args) {
        EventoMusical a = new EventoMusical("evento1", new Date(2022,5,1),new BigInteger("2000"));
    }
}
