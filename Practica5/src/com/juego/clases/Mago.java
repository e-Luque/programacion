package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Clases {
    private List<Habilidades> habilidades;
    public Mago() {
        super(
                "Mago", // nombre
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

        habilidades.add(new DanioCuerpoACuerpo("Toque Arcano",5,15));
        habilidades.add(new CuraCuerpoACuerpo("Restauración Etérea",3,25));
        habilidades.add(new DanioADistancia("Proyectil Místico",1,30));

        return habilidades;
    }
}