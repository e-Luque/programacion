package rpg.dao;

import rpg.model.Ciudad;
import rpg.model.Raza;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {
    private List<Ciudad> listaCiudades;

    public CiudadDAO(){
        this.listaCiudades = new ArrayList<>();
    }

    public List<Ciudad> cargarCiudades(){
        try {
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM CIUDADES");
            while (resultSet.next()) {
                listaCiudades.add(new Ciudad(resultSet.getInt("id"), resultSet.getString("nombre"),
                        resultSet.getInt("nivel_minimo_acceso")));
            }
        }
        catch (SQLException e){
            System.err.println("Error al acceder a la base de datos, ciudadDAO");
        }
        return listaCiudades;
    }
}
