package org.ieslosremedios.daw1.prog.ut4.arrays.practica4.act6;

import java.util.Arrays;

public class CompanniaMain {
    public static void main(String[] args) {

        Departamento departamentoVentas = new Departamento("Ventas");
        Departamento departamentoRRHH = new Departamento("RR.HH");
        Departamento departamentoProduccion = new Departamento("Produccion");


        Sede sede1 = new Sede("Madrid", departamentoProduccion, departamentoRRHH,departamentoVentas);
        Sede sede2 = new Sede("Barcelona", departamentoProduccion, departamentoRRHH,departamentoVentas);
        Sede sede3 = new Sede("Valencia", departamentoProduccion, departamentoRRHH,departamentoVentas);
        Sede sede4 = new Sede("Oviedo", departamentoProduccion, departamentoRRHH,departamentoVentas);

        Empleado empleado1 = new Empleado("1838492BC", "73273817Y", "Juan Manuel",
                "Herrera", "Ramirez", 2002, false);

        Empleado empleado2 = new Empleado("38281395LP", "32817591X", "Daniel",
                "Alfonso", "Castillos", 2001, false);

        Empleado empleado3 = new Empleado("81824728CK", "38281723H", "Federico",
                "Belmont", "Benitez", 1994, true);


        Sede[] sedes = {sede1, sede2, sede3, sede4};
        Empleado[] empleados = {empleado1, empleado2, empleado3};
        Departamento[] departamentos = {departamentoProduccion,departamentoProduccion,departamentoVentas};


        System.out.println("Sedes: ");
        System.out.println(Arrays.toString(sedes));
        System.out.println("Empleados: ");
        System.out.println(Arrays.toString(empleados));
        System.out.println("Departamentos: ");
        System.out.println(Arrays.toString(departamentos));
    }
}