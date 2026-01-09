package com.juego.clases;

public class Clases {
    private String nombre;
    private int vidaMaxima;
    private int fuerzaBonus;
    private int inteligenciaBonus;
    private int destrezaBonus;
    public Clases(String nombre, int vidaMaxima, int fuerzaBonus, int inteligenciaBonus, int destrezaBonus){
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.fuerzaBonus = fuerzaBonus;
        this.inteligenciaBonus=inteligenciaBonus;
        this.destrezaBonus=destrezaBonus;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getDestrezaBonus() {
        return destrezaBonus;
    }

    public int getInteligenciaBonus() {
        return inteligenciaBonus;
    }

    public int getFuerzaBonus() {
        return fuerzaBonus;
    }
}
