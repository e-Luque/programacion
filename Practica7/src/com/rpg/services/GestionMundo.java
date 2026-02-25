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

    public void cargarTodo(){
        TxtHelper txtHelper = new TxtHelper();
        listaCiudades = txtHelper.leerCiudades();
        JsonHelper jsonHelper = new JsonHelper();
        jsonHelper.leerPersonajes();
    }
}
