package rpg.utils;

import rpg.dao.*;
import rpg.model.*;
import rpg.ui.MenuPrincipal;

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
        RazaDAO razaDAO = new RazaDAO();
        listaRazas = razaDAO.cargarRazas();
        System.out.println("¡Razas cargadas con exito! NºRazas: "+listaRazas.size());

        ClaseDAO claseDAO = new ClaseDAO();
        listaClases = claseDAO.cargarClases();
        System.out.println("¡Clases cargadas con exito! NºClases: "+listaClases.size());

        CiudadDAO ciudadDAO = new CiudadDAO();
        listaCiudades = ciudadDAO.cargarCiudades();
        System.out.println("¡Ciudades cargadas con exito! NºCiudades: "+listaCiudades.size());

        PersonajeDAO personajeDAO = new PersonajeDAO();
        listaPersonajes = personajeDAO.cargarPersonajes();
        System.out.println("¡Personajes cargados con exito! NºPersonajes: "+listaPersonajes.size());

        ItemDAO itemDAO = new ItemDAO();
        listaItems = itemDAO.cargarItems();
        System.out.println("¡Items cargados con exito! NºItems: "+listaItems.size());

        HabilidadDAO habilidadDAO = new HabilidadDAO();
        listaHabilidades = habilidadDAO.cargarHabilidades();
        System.out.println("¡Habilidades cargadas con exito! NºHabilidades: "+listaHabilidades.size());

        System.out.println("");

        System.out.println("Iniciando Programa...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        MenuPrincipal menuPrincipal = new MenuPrincipal(this);
    }

    public List<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public List<Habilidad> getListaHabilidades() {
        return listaHabilidades;
    }

    public List<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public List<Clase> getListaClases() {
        return listaClases;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public List<Raza> getListaRazas() {
        return listaRazas;
    }
}
