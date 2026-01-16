package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Paladin extends Clases {
    private List<Habilidades> habilidades;
    public Paladin() {
        this.habilidades = crearHabilidades();
        super(
                "Paladin", // nombre
                115,        // vida máxima
                2,         // fuerza bonus
                1,          // inteligencia bonus
                0          // destreza bonus
        );
    }
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Golpe Sagrado",5,40));
        habilidades.add(new CuraCuerpoACuerpo("Imposición de Manos",3,35));
        habilidades.add(new DanioADistancia("Juicio de Luz",1,50));

        return habilidades;
    }
}