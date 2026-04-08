package rpg.dao;

import rpg.model.Item;
import rpg.model.Raza;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
    private List<Item> listaItems;
    public ItemDAO(){
        this.listaItems = new ArrayList<>();
    }
    public List<Item> cargarItems(){
        try {
            ConexionBD conexionBD = new ConexionBD();
            ResultSet resultSet = conexionBD.conectar("SELECT * FROM ITEMS");
            while (resultSet.next()) {
                listaItems.add(new Item(resultSet.getInt("id"), resultSet.getString("nombre"),
                        resultSet.getString("tipo"), resultSet.getInt("precio_oro"),
                        resultSet.getInt("bonificador_ataque"), resultSet.getInt("bonificador_defensa")));
            }
        }
        catch (SQLException e){
            System.err.println("Error al acceder a la base de datos, itemDAO:" + e.getMessage());
        }
        return listaItems;
    }
}
