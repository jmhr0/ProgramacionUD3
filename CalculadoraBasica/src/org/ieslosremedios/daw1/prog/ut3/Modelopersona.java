package org.ieslosremedios.daw1.prog.ut3;

//Get,Set,Metodos y clases
public class Modelopersona {
    //poner privates
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    Modelopersona () {
    }
     Modelopersona (String nombre, String apellido1) {
         this.nombre=nombre;
         this.apellido1= apellido1;
    }

    public void mayoromenosde18 (int edad) {
        if (edad>=18) {
            System.out.println("Es mayor de edad");


        }else{
            System.out.println("No es mayor de edad");
        }
    }
    public void NombreCompleto () {
        System.out.println( nombre + "" + apellido1 + "" + apellido2 );
    }

    public void Iniciales () {
        System.out.println( nombre + "" + apellido1 + "" + apellido2 );
    }

    //los metodos se encuentran entre los constructores y los gets
    public String getnombre() {

        return this.nombre;
    }

    public int getedad() {

        return this.edad ;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    {

    }

    public static int setedad;{

    }
}
//1 metodo + que muestra nombre completo (nombre+apellidos) + 1 metodo + que imprima las iniciales de la persona