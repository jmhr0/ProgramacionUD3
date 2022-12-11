package org.ieslosremedios.daw1.prog.ut3.Actividad32Herencia;

public class PrincipalAnimalPerro extends Perro {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.nombre = "Toby";
        perro1.raza = "Podenco";
        System.out.println("¡Guau! me llamo " + perro1.nombre + " y soy un " + perro1.raza);
        perro1.imprime();
        perro1.imprimePorPartes();
        //constructor de solo raza
        Perro perro2 = new Perro(perro1.raza);
        perro2.imprimePorPartes();
        //constructor de dos parametros
        Perro perro3 = new Perro("Rolly", "Dalmata");


        perro3.imprimePorPartes();
        perro2.imprimePorPartes();
        perro3.imprimePorPartes();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getRaza() {
        return super.getRaza();
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }
}
