package org.ieslosremedios.daw1.prog.ut4.arrays;

public class Act41_Arrays_Y_Metodos {
    //1Crea un método main
    public static void main(String[] args) {
        //2Declara una variable x de tipo int con valor 1

        int x = 1;
        //5 Haz lo mismo para una variable s de tipo String. Tendrás cambiar la declaración del método para que acepte un parámetro int y otro String.
        // ¿Serías capaz de hacerlo mediante sobrecarga en lugar de modificando el método? (principio de pogramación: open-close).
        // Comprueba igualmente si el valor de s cambia después de invocar el método. Lo que hará el método con el parámetro de tipo String será ponerlo en mayúsculas.
        String s = "hola";
        //6 Ahora vamos a incluir como parámetro una variable a de tipo array unidimensional de elementos tipo Double inicializada a los valores que  desemos.
        // Probamos igualmente si cambia tras la invocación del método o no.
        Double[] a = {1.01d, 1.02d, 1.03d, 1.04d, 1.05d};

        //4Invoca el método "m" desde main enviando "x" como argumento. Comprueba si la variable "x" cambia de valor después de ejecutar el método.
        // Para eso puedes imprimir las variables antes de invocar al método y después.
        //Impresion de variables antes de invocar
        System.out.println(x); //Imprimimos int x
        System.out.println(s); //Imprimimos String s
        System.out.println(a[0]); //Imprimimos la primera posicion del array
        System.out.println(a[(a.length - 1) / 2]); //Imprimimos la posicion intermedia del array
        System.out.println(a[a.length - 1]); //Imprimimos la ultima posicion del array
        System.out.println();
        m(x); //invocamos el metodo que suma 1 a x
        m(x, s); //invocamos el metodo que pone en mayuscula el texto
        m(x, s, a); //invocamos el metodo que suma 1 a las posiciones descritas en el array
        Arrayact7(x,s,a);
        //Impresion de variables despues de invocar
        System.out.println(s); //volvemos a imprimir s, el valor no cambia
        System.out.println(x); //volvemos a imprimir x, el valor no cambia
        System.out.println(a[0]); //volvemos a Imprimir la primera posicion del array
        System.out.println(a[(a.length - 1) / 2]); //volvemos a Imprimir la posicion intermedia del array
        System.out.println(a[a.length - 1]); //volvemos a Imprimir la posicion final del array
        //Cuando imprimimos el array los valores cambian ya que al ser tipo compuesto, estamos sustituyendo el valor a diferencias de los tipos primitivos

    }

    //3Crea un método "m" que no devuelva nada y reciba un parámetro de nombre x y tipo int. El método incrementará en una unidad el valor del parámetro.
    private static void m(int x) {
        x = x + 1;
    }

    //5 Creamos un metodo nuevo mediante sobrecarga, el metodo exclusivamente pondra nuestro string en mayusculas
    private static void m(int x, String s) {
        s = s.toUpperCase();
    }

    //6 El cambio que realizará el método sobre el parámetro tipo array será el de incrementar en 1 las posiciones primera (no la 1, sino la primera)
    // última y la que ocupe la posición de en medio (redondeando hacia abajo. p.ej. Si tiene 4 posiciones la de en medio será la segunda).
    private static void m(int x, String s, Double[] a) {
        a[0]++; //aumenta en 1 la PRIMERA posicion
        a[(a.length - 1) / 2]++; //aumenta en 1 la posicion INTERMEDIA
        a[a.length - 1]++; //aumenta en 1 la ULTIMA posicion
    }

    //7 Cambiamos el método (¿o seguimos sobrecargando?) para que devuelva un array bidimensional de tipo int
    // formando una matriz de N x M, donde N ese el tamaño del array de Doubles del parámetro de entrada y M es igual a 2.
    // Vamos a copiar el array de entrada al de salida:
    // para cada posición del array de salida guardaremos primero la parte entera correspondiente a la misma posición del array de entrada y la parte decimal después.
    public static int[][] Arrayact7(int x, String s, Double[] input) {
        int n = input.length;
        int m = 2;
        int[][] output = new int[n][m];

        m(x, s, input);

        output[0][0] = (int) Math.floor(input[0]);
        output[0][1] = (int) Math.floor(input[0]);

        output[1][0] = (int) Math.floor(input[1]);
        output[1][1] = (int) Math.floor(input[1]);

        output[2][0] = (int) Math.floor(input[2]);
        output[2][1] = (int) Math.floor(input[2]);

        output[3][0] = (int) Math.floor(input[3]);
        output[3][1] = (int) Math.floor(input[3]);

        output[4][0] = (int) Math.floor(input[4]);
        output[4][1] = (int) Math.floor(input[4]);

        return output;
    }
}