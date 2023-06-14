package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.act6;

import com.objectdb.o.DPS;

public class Sede {
    String localizacion;
    Departamento departamento;

    Sede(){}

    Sede(String localizacion, Departamento departamento,Departamento departamento2,Departamento departamento3){
        this.localizacion = localizacion;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "localizacion='" + localizacion + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}