package com.juego.habilidades;

public interface Habilidades {

    String getNombre();

    int getUsosRestantes();

    boolean sePuedeUsar();

    int aplicar();
    // devuelve el valor de daño o curación
}