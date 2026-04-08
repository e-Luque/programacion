package rpg.dao;

import java.sql.*;

public class ConexionBD {

    private static final String URL = "jdbc:postgresql://localhost:5432/XRPG";
    private static final String USER = "xrpg_user";
    private static final String PASSWORD = "xrpg_password";

    public ResultSet conectar(String consulta) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            return statement.executeQuery(consulta);
        }
        catch (SQLException e){
            System.err.println("ERROR AL CONECTAR A LA BASE DE DATOS:" + e.getMessage());
        }
        return null;
    }
}
