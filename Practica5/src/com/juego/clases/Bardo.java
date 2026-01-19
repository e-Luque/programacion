package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Bardo extends Clases {
    private List<Habilidades> habilidades;
    public Bardo() {
        super(
                "Bardo", // nombre
                90,        // vida máxima
                0,         // fuerza bonus
                3,          // inteligencia bonus
                0          // destreza bonus
        );
        this.habilidades = crearHabilidades();
    }
    @Override
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Golpe Armónico",5,10));
        habilidades.add(new CuraCuerpoACuerpo("Balada Reconfortante",3,15));
        habilidades.add(new DanioADistancia("Nota Discordante",1,25));

        return habilidades;
    }
}