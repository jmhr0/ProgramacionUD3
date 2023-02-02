package org.ieslosremedios.daw1.prog.ut4.arrays.expresionesRegulares;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patrones {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Pa.*");
        Matcher m = p.matcher("Pata");
        System.out.println(m.matches());
        System.out.println(Arrays.toString("Hola me llamo juan".split(" ")));
        System.out.println("Pat".matches("^P.."));

    }
}
