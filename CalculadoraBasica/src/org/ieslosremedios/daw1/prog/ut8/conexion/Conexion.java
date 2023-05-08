package org.ieslosremedios.daw1.prog.ut8.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {
        // jdbc= driver que se utiliza
        // mariadb= protocolo utilizado
        // resto de la URL (localhost, puerto y nombre de la base de datos)
        String url = "jdbc:mariadb://localhost:3306/tienda";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "juanma", "herramjm");
            Statement stm = con.createStatement();

            System.out.println("!Conexión exitosa¡");

            stm.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Ha fallado la conexion" + e.getMessage());
        }
    }
}
