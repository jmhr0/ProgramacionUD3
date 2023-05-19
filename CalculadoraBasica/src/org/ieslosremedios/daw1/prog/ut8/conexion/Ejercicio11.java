package org.ieslosremedios.daw1.prog.ut8.conexion;

import java.sql.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";

        try {

            Connection con = DriverManager.getConnection(url, "juanma", "herramjm");
            Statement stm = con.createStatement();

            System.out.println("!Conexión exitosa¡");

            System.out.println("Tablas existentes");

            String query = "SELECT * FROM productos WHERE LOWER(pais) =Espana";

            boolean hayresultset= stm.execute(query);

            ResultSet resultSet= stm.getResultSet();

            while(resultSet.next()){
                System.out.println( "---------- \n" + "<" + resultSet.getString("1") + ">");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}