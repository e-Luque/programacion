package rpg.dao;

import rpg.model.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {
    List<Personaje> listaPersonajes;
    public PersonajeDAO(){
        this.listaPersonajes = new ArrayList<>();
    }
    public List<Personaje> cargarPersonajes(){
        try {
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM PERSONAJES");
            while (resultSet.next()) {
                listaPersonajes.add(new Personaje(resultSet.getInt("id"), resultSet.getString("nombre"),
                        resultSet.getInt("nivel"), resultSet.getInt("oro"), resultSet.getInt("vida_actual"),
                        resultSet.getInt("id_raza"), resultSet.getInt("id_clase"), resultSet.getInt("id_ciudad_actual")));
            }
        }
        catch (SQLException e){
            System.err.println("Error al acceder a la base de datos, personajeDAO");
        }
        return listaPersonajes;
    }
}
