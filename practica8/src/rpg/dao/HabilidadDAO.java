package rpg.dao;

import rpg.model.Clase;
import rpg.model.Habilidad;
import rpg.model.Item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HabilidadDAO {
    private List<Habilidad> listaHabilidades;
    public HabilidadDAO(){
        this.listaHabilidades = new ArrayList<>();
    }
    public List<Habilidad> cargarHabilidades(){
        try {
            int errores_contador = 0;
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM HABILIDADES");
            while (resultSet.next()) {
                ClaseDAO claseDAO = new ClaseDAO();
                claseDAO.cargarClases();
                Clase clase = claseDAO.esClase(resultSet.getInt("id_clase"));
                if(clase != null){
                    listaHabilidades.add(new Habilidad(resultSet.getInt("id"), resultSet.getString("nombre"),
                            resultSet.getInt("dano_base"),
                            resultSet.getInt("usos_maximos"), clase));
                }
                else{
                    errores_contador++;
                }
            }
        }
        catch (SQLException e){
            System.err.println("Error al acceder a la base de datos, habilidadDAO:" + e.getMessage());
        }
        return listaHabilidades;
    }
}
