package com.rpg.utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.Items;
import com.rpg.model.Personajes;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {
    public JsonHelper(){
    };
    public List<Personajes> leerPersonajes(){
        Gson gson = new Gson();
        List<Personajes> personajes = new ArrayList<>();
        try (FileReader reader = new FileReader("Practica7\\ficheros\\Personajes.json")) {
            Type listaTipo = new TypeToken<List<Personajes>>() {}.getType();
            personajes = gson.fromJson(reader, listaTipo);
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
        return personajes;
    }
    public List<Items> leerItems(){
        Gson gson = new Gson();
        List<Items> items = new ArrayList<>();
        try (FileReader reader = new FileReader("Practica7\\ficheros\\Items.json")) {
            Type listaTipo = new TypeToken<List<Items>>() {}.getType();
            items = gson.fromJson(reader, listaTipo);
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
        return items;
    }
}
