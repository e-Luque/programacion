package com.rpg.services;

import com.rpg.handler.DatoInvalidoException;
import com.rpg.handler.FormatoInvalidoException;
import com.rpg.handler.RPGDataException;
import com.rpg.handler.RecursoNoEncontradoException;
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
        }
        catch (DatoInvalidoException e){
            System.err.println("Nivel Invalido");
            loggerCustom.escribirLog(e.getMessage());
        }
    }
    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItems) throws RPGDataException {
        try{

            for (String id : idsItems) {
                if (!mapaItems.containsKey(id)) {
                    loggerCustom.escribirLog("El Item no Existe");
                    throw new RecursoNoEncontradoException("El Item no Existe");
                }
            }

            Personajes personaje = new Personajes(nombre, raza, nivel, idsItems);
            listaPersonajes.add(personaje);

        }
        catch (Exception e){
            loggerCustom.escribirLog("No se ha podido crear el personaje "+e.getMessage());
        }
    }
    public void guardarCambios() throws FormatoInvalidoException {
        JsonHelper jsonHelper = new JsonHelper();
        jsonHelper.escribirJSON("Practica7/ficheros/Personajes.json", listaPersonajes);
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
