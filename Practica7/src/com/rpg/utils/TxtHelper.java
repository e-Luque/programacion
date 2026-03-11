package com.rpg.utils;

import com.rpg.model.Ciudades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {
    public TxtHelper(){
    }
    public List<Ciudades> leerCiudades(){
        List<Ciudades> ciudades = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines (Paths.get("Practica7\\ficheros\\Ciudades.txt"));
            for (String linea: lineas) {
                String[] s = linea.split(";");
                Ciudades c = new Ciudades(
                        s[0],
                        Integer.parseInt(s[1]),
                        s[2],
                        Integer.parseInt(s[3])
                );
                ciudades.add(c);
            }
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero.");
        }
        return ciudades;
    }
}
