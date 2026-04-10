package rpg.dao;

import rpg.model.Clase;
import rpg.model.Personaje;
import rpg.model.Raza;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RazaDAO {
    private List<Raza> razas;
    public RazaDAO(){
        this.razas = new ArrayList<>();
    }
    public List<Raza> cargarRazas(){
        try {
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM RAZAS");
            while (resultSet.next()) {
                razas.add(new Raza(resultSet.getInt("id"), resultSet.getString("nombre"),
                        resultSet.getInt("bonificador_vida"), resultSet.getInt("bonificador_fuerza")));
            }

        }
        catch (SQLException e){
            System.err.println("Error al acceder a la base de datos, razaDAO");
        }
        return razas;
    }
    public Raza esRaza(int id_raza){
        for (int i = 0; i < razas.size(); i++) {
            if (id_raza == razas.get(i).getId()){
                return razas.get(i);
            }
        }
        return null;
    }
}
