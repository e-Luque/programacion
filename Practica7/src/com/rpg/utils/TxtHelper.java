package com.rpg.utils;

import com.rpg.model.Ciudades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TxtHelper {
    public void leerCiudades(){
        try {
            List<String> lineas = Files.readAllLines (Paths.get("Practica7\\ficheros\\Ciudades.txt"));
            for (String linea: lineas) {
                System.out.println(linea);
                List<Ciudades> ciudades = new Ciudades();
            }
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
    }
}
