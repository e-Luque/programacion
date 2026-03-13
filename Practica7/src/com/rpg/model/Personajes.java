package com.rpg.model;

import java.util.ArrayList;
import java.util.List;

public class Personajes {
    private String nombre;
    private String raza;
    private Integer nivel;
    private List<String> equipoID;
    private String nombre_ciudad;
    public Personajes(String nombre, String raza, Integer nivel, List<String> equipoID, String nombre_ciudad){
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.equipoID = equipoID;
        this.nombre_ciudad = nombre_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public List<String> getEquipoID() {
        return equipoID;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }
}
