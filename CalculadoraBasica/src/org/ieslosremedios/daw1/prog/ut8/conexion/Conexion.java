package org.ieslosremedios.daw1.prog.ut8.conexion;

import javax.management.Query;
import java.sql.*;

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

            String query = "SELECT * FROM productos ORDER BY precio";

            ResultSet resultados = stm.executeQuery(query);


            while (resultados.next()) {
                System.out.println("Nombre: " + resultados.getString("nombre") + "| Precio: "
                        + resultados.getInt("precio") + "| Pais: " + resultados.getString("Pais") +
                        "| Descripcion: " + resultados.getString("descripcion"));
            }

            stm.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Ha fallado la conexion" + e.getMessage());
        }
    }
}