package org.ieslosremedios.daw1.prog.ut3.ActividadInterfaz34;

public interface Imprimible {
    //2;Crear una constante en la interfaz Imprimible que sea TEXTO_POR_DEFECTO = “Página de prueba”.
    /*
    Especificamos que sera una constante mediante la palabra reservada "final" aunque de manera predeterminada ya lo sería en caso de no añadir
    la palabra reservada por la naturaleza de las interfaces
     */
    final String TEXTO_POR_DEFECTO="Página de prueba";

    //1; Crear una interfaz de nombre “Imprimible” con un método de nombre “imprime” que no devuelve ni recibe ningún parámetro.
    void imprime ();
    void establecerContenido(String contenido);
}
