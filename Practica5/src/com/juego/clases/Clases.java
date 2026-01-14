package com.juego.clases;
import com.juego.habilidades.*;
import java.util.ArrayList;
import java.util.List;

public class Clases {

    private String nombre;
    private int vidaMaxima;
    private int fuerzaBonus;
    private int inteligenciaBonus;
    private int destrezaBonus;

    public Clases(String nombre, int vidaMaxima, int fuerzaBonus, int inteligenciaBonus, int destrezaBonus) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.fuerzaBonus = fuerzaBonus;
        this.inteligenciaBonus = inteligenciaBonus;
        this.destrezaBonus = destrezaBonus;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getFuerzaBonus() {
        return fuerzaBonus;
    }

    public int getInteligenciaBonus() {
        return inteligenciaBonus;
    }

    public int getDestrezaBonus() {
        return destrezaBonus;
    }

    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo());
        habilidades.add(new CuraCuerpoACuerpo());
        habilidades.add(new DanioADistancia());

        return habilidades;
    }
}
