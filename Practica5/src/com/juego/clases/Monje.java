package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Monje extends Clases {
    private List<Habilidades> habilidades;
    public Monje() {
        super(

                "Monje", // nombre
                150,        // vida máxima
                20,         // fuerza bonus
                5,          // inteligencia bonus
                10          // destreza bonus
        );
        this.habilidades = crearHabilidades();
    }
    @Override
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Puño del Dragón",5,35));
        habilidades.add(new CuraCuerpoACuerpo("Flujo Interior",3,30));
        habilidades.add(new DanioADistancia("Onda de Chi",1,40));

        return habilidades;
    }
}