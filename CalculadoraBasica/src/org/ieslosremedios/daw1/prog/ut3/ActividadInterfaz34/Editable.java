package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public interface Editable {
    void establecerContenido(String contenido);
    /*
    Crea una nueva interfaz llamada “Editable” y traspasa (corta y pega) el método “establecerContenido” a ella. Luego haz que
    “Imprimible” herede tanto de “Borrable”
     como de “Imprimible”
     ¿Sigue funcionando todo igual? ¿por qué?
     */

    //Si, todo seguira funcionando igual ya que cualquier interfaz (en este caso Imprimible) pueden heredar de varias interfaces
}
