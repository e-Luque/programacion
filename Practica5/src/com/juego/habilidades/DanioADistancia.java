package com.juego.habilidades;

public class DanioADistancia extends HabilidadBase {

    public DanioADistancia() {
        super("Ataque a distancia", 1, 20);
    }

    @Override
    public int aplicar() {
        if (!sePuedeUsar()) {
            return 0;
        }
        consumirUso();
        return -valor;
    }
}
