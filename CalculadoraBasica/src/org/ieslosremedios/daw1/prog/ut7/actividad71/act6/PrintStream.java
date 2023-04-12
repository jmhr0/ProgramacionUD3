package org.ieslosremedios.daw1.prog.ut7.actividad71.act6;

class PrintStream {
    public static void main(String[] args) {

        String data = "Texto dentro del archivo";

        try {
            java.io.PrintStream output = new java.io.PrintStream("output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}