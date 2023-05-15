package org.ieslosremedios.daw1.prog.ut8.conexion;

import java.sql.*;

public class ConexiónInsertDeleteUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";

        try {
            Connection con = DriverManager.getConnection(url, "juanma", "herramjm");
            Statement stm = con.createStatement();

            System.out.println("!Conexión exitosa¡");

            String queryDelete= "DELETE FROM tienda.productos";

            String queryInsert = "INSERT INTO tienda.productos (id, nombre, descripcion, precio, pais)" +
                    "VALUES ('1','manzana','Manzanas golden', '50', 'Francia'),"+
                    "('2','pera','Peras conferencia','25','Espana'),('3','uva','Uvas groumet','30','Espana')";

            String queryUpdate = "UPDATE tienda.productos SET precio = 20.20 WHERE id = '3'";

            stm.addBatch(queryDelete);
            stm.addBatch(queryInsert);
            stm.addBatch(queryUpdate);

            int[] numReg = stm.executeBatch();
            con.commit();

            stm.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Ha fallado la conexion" + e.getMessage());
        }
    }
}