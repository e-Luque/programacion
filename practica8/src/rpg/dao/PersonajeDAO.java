package rpg.dao;

import rpg.model.Ciudad;
import rpg.model.Clase;
import rpg.model.Personaje;
import rpg.model.Raza;
import rpg.utils.GestionDatos;

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
            Integer error_contador = 0;
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM PERSONAJES");
            while (resultSet.next()) {
                // COMPRBACION CLASES ----
                ClaseDAO claseDAO = new ClaseDAO();
                claseDAO.cargarClases();
                Clase clase = claseDAO.esClase(resultSet.getInt("id_clase"));
                RazaDAO razaDAO = new RazaDAO();
                razaDAO.cargarRazas();
                Raza raza = razaDAO.esRaza(resultSet.getInt("id_raza"));
                CiudadDAO ciudadDAO = new CiudadDAO();
                ciudadDAO.cargarCiudades();
                Ciudad ciudad = ciudadDAO.esCiudad(resultSet.getInt("id_ciudad_actual"));

                if(clase != null && raza != null && ciudad != null){
                    listaPersonajes.add(new Personaje(resultSet.getInt("id"), resultSet.getString("nombre"),
                            resultSet.getInt("nivel"), resultSet.getInt("oro"), resultSet.getInt("vida_actual"),
                            raza, clase , ciudad));
                }
                else{
                    error_contador++;
                }
                }
        }
        catch (SQLException e){
            System.err.println("Error al acceder a la base de datos, personajeDAO");
        }
        return listaPersonajes;
    }
}
