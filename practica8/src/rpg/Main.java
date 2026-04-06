package rpg;

import rpg.dao.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            ConexionBD conexionBD = new ConexionBD();
            Connection connection = conexionBD.conectar();
        } catch (SQLException e) {
            System.err.println("Hola mundo");
        }
    }
}
