package com.juego.habilidades;

public class CuraCuerpoACuerpo extends HabilidadBase {

    public CuraCuerpoACuerpo() {
        super("Curación", 3, 8);
    }

    @Override
    public int aplicar() {
        if (!sePuedeUsar()) {
            return 0;
        }
        consumirUso();
        return valor; // positivo = curación
    }
}
