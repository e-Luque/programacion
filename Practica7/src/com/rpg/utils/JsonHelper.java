package com.rpg.utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.rpg.handler.FormatoInvalidoException;
import com.rpg.model.Items;
import com.rpg.model.Personajes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {
    private LoggerCustom loggerCustom;
    public JsonHelper(){
        this.loggerCustom = new LoggerCustom();
    };
    public List<Personajes> leerPersonajes() throws FormatoInvalidoException{
        Gson gson = new Gson();
        List<Personajes> personajes = new ArrayList<>();
        try (FileReader reader = new FileReader("Practica7\\ficheros\\Personajes.json")) {
            Type listaTipo = new TypeToken<List<Personajes>>() {}.getType();
            personajes = gson.fromJson(reader, listaTipo);
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
        catch (Exception e) {
            loggerCustom.escribirLog("No se ha podido procesar el fichero: "+ e.getMessage());
            throw new FormatoInvalidoException("No se ha podido procesar el fichero");
        }
        return personajes;
    }
    public List<Items> leerItems() throws FormatoInvalidoException{
        Gson gson = new Gson();
        List<Items> items = new ArrayList<>();
        try (FileReader reader = new FileReader("Practica7\\ficheros\\Items.json")) {
            Type listaTipo = new TypeToken<List<Items>>() {}.getType();
            items = gson.fromJson(reader, listaTipo);
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
        catch (Exception e) {
            loggerCustom.escribirLog("No se ha podido procesar el fichero: "+ e.getMessage());
            throw new FormatoInvalidoException("No se ha podido procesar el fichero");
        }
        return items;
    }
    public <T> void escribirJSON(String path, List<T> lista) throws FormatoInvalidoException {
        try (Writer writer = new FileWriter(path)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(lista, writer);
        } catch (IOException e) {
            loggerCustom.escribirLog("No se ha podido escribir en el archivo: "+ e.getMessage());
            throw new FormatoInvalidoException("No se ha podido escribir en el archivo "+e.getMessage());
        }
    }
}
