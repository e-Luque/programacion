package rpg.dao;

import rpg.model.Ciudad;
import rpg.model.Clase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClaseDAO {
    private List<Clase> listaClases;
    public ClaseDAO(){
        this.listaClases = new ArrayList<>();
    }
    public List<Clase> cargarClases(){
        try {
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM CLASES_RPG");
            while (resultSet.next()) {
                listaClases.add(new Clase(resultSet.getInt("id"), resultSet.getString("nombre")));
            }
        }
        catch (
                SQLException e){
            System.err.println("Error al acceder a la base de datos, claseDAO");
        }
        return this.listaClases;
    }
}
