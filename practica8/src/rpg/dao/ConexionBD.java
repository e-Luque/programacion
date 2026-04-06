package rpg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "/var/lib/postgresql/data";
    private static final String USER = "xrpg_user";
    private static final String PASSWORD = "xrpg_password";

    public Connection conectar() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e){
            System.err.println("ERROR AL CONECTAR A LA BASE DE DATOS");
        }
        return null;
    }
}
