package com.juego.habilidades;

public class DanioCuerpoACuerpo implements Habilidades {
    private String nombre;
    private int usosMaximos;
    private int usosRestantes;
    private int valor;

    public DanioCuerpoACuerpo() {
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public int getUsosRestantes() {
        return 0;
    }

    @Override
    public boolean sePuedeUsar() {
        return false;
    }

    @Override
    public int aplicar() {
        if (!sePuedeUsar()) {
            return 0;
        }
        consumirUso();
        return -valor; // negativo = daño
    }
}