package com.rpg.services;

import com.rpg.model.Ciudades;
import com.rpg.model.Items;
import com.rpg.model.Personajes;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.TxtHelper;

import java.util.List;

public class GestionMundo {
    private List<Ciudades> listaCiudades;
    private List<Personajes> listaPersonajes;
    private List<Items> listaItems;
    public GestionMundo(){
    }
    public void cargarTodo(){
        TxtHelper txtHelper = new TxtHelper();
        listaCiudades = txtHelper.leerCiudades();
        JsonHelper jsonHelper = new JsonHelper();
        listaPersonajes = jsonHelper.leerPersonajes();
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
