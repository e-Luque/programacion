package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Robot extends Clases {
    private List<Habilidades> habilidades;
    public Robot() {
        super(
                "Robot", // nombre
                150,        // vida máxima
                3,         // fuerza bonus
                3,          // inteligencia bonus
                3          // destreza bonus
        );
        this.habilidades = crearHabilidades();
    }
    @Override
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Puño Hidráulico",5,50));
        habilidades.add(new CuraCuerpoACuerpo("Protocolo de Autorrecuperación",3,20));
        habilidades.add(new DanioADistancia("Ráfaga de Plasma",1,15));

        return habilidades;
    }
}