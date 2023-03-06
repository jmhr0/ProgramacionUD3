package org.ieslosremedios.daw1.prog.ut6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejnullpointer {
    public static void main(String[] args) {
        List lista = null;
        lista.add(1);

    }
}
