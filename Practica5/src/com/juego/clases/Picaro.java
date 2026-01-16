package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Picaro extends Clases {
    private List<Habilidades> habilidades;
    public Picaro() {
        this.habilidades = crearHabilidades();
        super(
                "Picaro", // nombre
                105,        // vida máxima
                0,         // fuerza bonus
                0,          // inteligencia bonus
                3          // destreza bonus
        );
    }
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Puñalada Sombría",5,50));
        habilidades.add(new CuraCuerpoACuerpo("Venda Rápida",3,20));
        habilidades.add(new DanioADistancia("Daga Lanzada",1,15));

        return habilidades;
    }
}