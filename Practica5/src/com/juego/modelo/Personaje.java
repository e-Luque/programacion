package com.juego.modelo;

import com.juego.clases.Clases;
import com.juego.habilidades.Habilidades;
import com.juego.razas.Razas;

import java.util.List;

public class Personaje {
    private String nombre;
    private Razas raza;
    private Clases clase;
    private int vida;
    private int vidaMaxima
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private List<Habilidades> habilidades;

    public Personaje(String nombre,Razas raza,Clases clase){
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;

        this.vida = raza.getVidaBase()+clase.getVidaMaxima();
        this.fuerza = raza.getFuerzaBase() + clase.getFuerzaBonus();
        this.inteligencia = raza.getInteligenciaBase()+ clase.getInteligenciaBonus();
        this.destreza = raza.getDestrezaBase() + clase.getDestrezaBonus();
        this.habilidades = clase.crearHabilidades();
        this.vidaMaxima = this.vida;
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

    public void crearPersonaje(){

    }
    public void recibirDanio(int cantidad) {
        this.vida += cantidad;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void curar(int cantidad) {
        this.vida += cantidad;
        if (this.vida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        }
    }
}
