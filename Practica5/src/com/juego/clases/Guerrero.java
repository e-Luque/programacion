package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Guerrero extends Clases {
    private List<Habilidades> habilidades;
    public Guerrero() {
        super(
                "Guerrero", // nombre
                120,        // vida máxima
                3,         // fuerza bonus
                0,          // inteligencia bonus
                0          // destreza bonus
        );
        this.habilidades = crearHabilidades();
    }
    @Override
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Corte Devastador",5,30));
        habilidades.add(new CuraCuerpoACuerpo("Segundo Aliento",3,20));
        habilidades.add(new DanioADistancia("Lanzamiento de Hacha",1,40));

        return habilidades;
    }
}