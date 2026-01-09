package com.juego.razas;

public class Razas {
    private String nombre;
    private int vidaBase;
    private int fuerzaBase;
    private int inteligenciaBase;
    private int destrezaBase;
    public Razas (String nombre, int vidaBase, int fuerzaBase, int inteligenciaBase, int destrezaBase){
        this.nombre = nombre;
        this.vidaBase=vidaBase;
        this.fuerzaBase=fuerzaBase;
        this.inteligenciaBase=inteligenciaBase;
        this.destrezaBase=destrezaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDestrezaBase() {
        return destrezaBase;
    }

    public int getFuerzaBase() {
        return fuerzaBase;
    }

    public int getInteligenciaBase() {
        return inteligenciaBase;
    }

    public int getVidaBase() {
        return vidaBase;
    }
}
