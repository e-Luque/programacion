package com.juego.habilidades;

public class DanioCuerpoACuerpo extends HabilidadBase {

    public DanioCuerpoACuerpo() {
        super("Golpe cuerpo a cuerpo", 5, 10);
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
