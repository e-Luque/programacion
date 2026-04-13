package rpg.dao;

import java.sql.SQLException;

public class InventarioDAO {
    public void registrarCompra(int idPersonaje, int idItem) {

        String sql = "INSERT INTO INVENTARIOS (id_personaje, id_item, cantidad) VALUES ("
                + idPersonaje + ", " + idItem + ", 1)";
        try {
            ConexionBD con = new ConexionBD();
            con.ejecutarUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Error al registrar en inventario: " + e.getMessage());
        }
    }
}