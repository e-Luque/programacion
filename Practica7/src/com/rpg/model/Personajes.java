package com.rpg.model;

import java.util.ArrayList;
import java.util.List;

public class Personajes {
    private String nombre;
    private String raza;
    private Integer nivel;
    private List<String> equipoID;
    public Personajes(String nombre, String raza, Integer nivel){
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.equipoID = new ArrayList<>();
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
}
