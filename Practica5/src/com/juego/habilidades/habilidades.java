package com.juego.habilidades;

public class habilidades {
    private String nombre;
    private int usos;
    private int danioBase;

    public habilidades(String nombre, int usos){
        this.nombre = nombre;
        this.usos = usos;
        this.danioBase = danioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUsos() {
        return usos;
    }
}

