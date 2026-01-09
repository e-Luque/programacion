package com.juego.modelo;

import com.juego.clases.Clases;
import com.juego.razas.Razas;

public class Personaje {
    private String nombre;
    private Razas raza;
    private Clases clase;
    private int vida = raza.getVidaBase()+clase.getVidaMaxima();
    private int fuerza = raza.getFuerzaBase() + clase.getFuerzaBonus();
    private int inteligencia = raza.getInteligenciaBase()+ clase.getInteligenciaBonus();
    private int destreza = raza.getDestrezaBase() + clase.getDestrezaBonus();

    public Personaje(String nombre,Razas raza,Clases clase){
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }
}
