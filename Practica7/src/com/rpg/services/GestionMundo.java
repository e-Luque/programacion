package com.rpg.services;

import com.rpg.handler.*;
import com.rpg.model.Ciudades;
import com.rpg.model.Items;
import com.rpg.model.Personajes;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.LoggerCustom;
import com.rpg.utils.TxtHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GestionMundo {
    private List<Ciudades> listaCiudades;
    private List<Personajes> listaPersonajes;
    private List<Items> listaItems;
    private HashMap<String,Items> mapaItems;
    private LoggerCustom loggerCustom;
    public GestionMundo(){
        this.loggerCustom = new LoggerCustom();
        this.mapaItems = new HashMap<>();
    }
    public void cargarTodo() throws RPGDataException{
        try{
            TxtHelper txtHelper = new TxtHelper();
            listaCiudades = txtHelper.leerCiudades();
            JsonHelper jsonHelper = new JsonHelper();
            listaPersonajes = jsonHelper.leerPersonajes();
            listaItems = jsonHelper.leerItems();
            for (Items item: listaItems){
                this.mapaItems.put(item.getId(), item);
            }
            for (int i = 0; i < listaPersonajes.size(); i++) {
                if (listaPersonajes.get(i).getNivel()<0){
                    throw new DatoInvalidoException("Dato Invalido");
                }
            }
            validarDatos();
        }
        catch (DatoInvalidoException e){
            System.err.println("Nivel Invalido");
            loggerCustom.escribirLog(e.getMessage());
        }

    }
    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItems, String nombre_ciudad) throws RPGDataException {
        try{
            for (String id : idsItems) {
                if (!mapaItems.containsKey(id)) {
                    loggerCustom.escribirLog("El Item no Existe");
                    throw new RecursoNoEncontradoException("El Item no Existe");
                }
            }
            Personajes personaje = new Personajes(nombre, raza, nivel, idsItems, nombre_ciudad);
            validarPersonaje(personaje);
            listaPersonajes.add(personaje);
        }
        catch (Exception e){
            loggerCustom.escribirLog("No se ha podido crear el personaje" +e.getMessage());
        }
    }

    public void validarPersonaje(Personajes personaje){
        try{
            for (int i = 0; i < listaCiudades.size(); i++) {
            if(listaCiudades.get(i).getNombre().equals(personaje.getNombre_ciudad())){
                if ((listaCiudades.get(i).getClima().equals("Desertico")) && (personaje.getRaza().equals("Enano"))){
                    listaPersonajes.remove(personaje);
                    throw new ValidadorBiomaException("Personaje para Bioma invalido");
                }
            }
        }
        }
        catch (ValidadorBiomaException e){
            System.err.println("ERROR: Bioma invalido");
            loggerCustom.escribirLog("No se ha podido leer el fichero json: "+e.getMessage());
        }
    }
    public void validarItem (Items item) {
        try {
            for (int i = 0; i < listaCiudades.size(); i++) {
                if (listaCiudades.get(i).getNombre().equals(item.getNombre_ciudad())) {
                    if ((listaCiudades.get(i).getClima().equals("Volcanico")) && (item.getTipo().equals("HIELO"))) {
                        listaItems.remove(item);
                        throw new ValidadorBiomaException("Item para Bioma invalido");
                    }
                }
            }
        }
        catch (ValidadorBiomaException e){
            System.err.println("ERROR: Bioma invalido");
            loggerCustom.escribirLog("No se ha podido leer el fichero json: "+e.getMessage());
        }
    }
    public void guardarCambios() throws FormatoInvalidoException {
        JsonHelper jsonHelper = new JsonHelper();
        jsonHelper.escribirJSON("Practica7/ficheros/Personajes.json", listaPersonajes);
        jsonHelper.escribirJSON("Practica7/ficheros/Items.json", listaItems);
    }

    public void validarDatos(){
        for (Personajes personaje : listaPersonajes){
            validarPersonaje(personaje);
        }
        for (Items item : listaItems){
            validarItem(item);
        }
    }
    public List<Ciudades> getListaCiudades() {
        return listaCiudades;
    }

    public List<Items> getListaItems() {
        return listaItems;
    }

    public List<Personajes> getListaPersonajes() {
        return listaPersonajes;
    }

    public void setListaCiudades(List<Ciudades> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public void setListaPersonajes(List<Personajes> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    public void setListaItems(List<Items> listaItems) {
        this.listaItems = listaItems;
    }
}
