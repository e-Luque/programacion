package rpg.utils;

import rpg.dao.PersonajeDAO;
import rpg.model.*;

import java.util.List;

public class GestionDatos {
    List<Personaje> listaPersonajes;
    List<Ciudad> listaCiudades;
    List<Habilidad> listaHabilidades;
    List<Inventario> inventarios;
    List<Item> listaItems;
    List<Raza> listaRazas;
    List<Clase> listaClases;
    public GestionDatos(){
    };
    public void cargarTodo(){
        PersonajeDAO personajeDAO = new PersonajeDAO();
        personajeDAO.cargarPersonajes();
    }
}
