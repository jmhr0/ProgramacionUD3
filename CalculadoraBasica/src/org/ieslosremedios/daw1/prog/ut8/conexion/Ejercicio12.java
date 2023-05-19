package org.ieslosremedios.daw1.prog.ut8.conexion;

import java.sql.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/";

        try {

            Connection con = DriverManager.getConnection(url, "juanma", "herramjm");
            Statement stm = con.createStatement();

            System.out.println("!Conexión exitosa¡");

            DatabaseMetaData metaData= con.getMetaData();
            ResultSet resultSet = metaData.getTables("tienda",null, null, null);
            System.out.println("Tablas existentes");


            while(resultSet.next()){
                System.out.println( "---------- \n" + "<" + resultSet.getString("COLUMN_NAME") + ">");
            }
            ResultSet resultSet2 = metaData.getColumns("tienda", null, "productos", null);

            while(resultSet.next()){
                System.out.println( "---------- \n" + "<" + resultSet2.getString("COLUMN_NAME") + ">");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}