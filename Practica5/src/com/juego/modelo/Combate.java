package com.juego.modelo;

import com.juego.habilidades.Habilidades;

public class Combate {
    private Personaje jugador1;
    private Personaje jugador2;
    public Combate (Personaje jugador1,Personaje jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Personaje getJugador1() {
        return jugador1;
    }
    public Personaje getJugador2() {
        return jugador2;
    }
    public void ataqueCuerpoACuerpo(Personaje jugador1, Personaje jugador2){

    }
}
