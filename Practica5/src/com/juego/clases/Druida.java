package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Druida extends Clases {
    private List<Habilidades> habilidades;
    public Druida() {
        super(
                "Druida", // nombre
                100,        // vida máxima
                2,         // fuerza bonus
                1,          // inteligencia bonus
                0          // destreza bonus
        );
        this.habilidades = crearHabilidades();
    }
    @Override
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Garra Salvaje",5,25));
        habilidades.add(new CuraCuerpoACuerpo("Regeneración Natural",3,20));
        habilidades.add(new DanioADistancia("Espina Creciente",1,45));

        return habilidades;
    }
}