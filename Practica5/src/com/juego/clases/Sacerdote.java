package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidades;

import java.util.ArrayList;
import java.util.List;

public class Sacerdote extends Clases {
    private List<Habilidades> habilidades;
    public Sacerdote() {
        super(
                "Sacerdote", // nombre
                95,        // vida máxima
                0,         // fuerza bonus
                3,          // inteligencia bonus
                0          // destreza bonus
        );
        this.habilidades = crearHabilidades();
    }
    @Override
    public List<Habilidades> crearHabilidades() {
        List<Habilidades> habilidades = new ArrayList<>();

        habilidades.add(new DanioCuerpoACuerpo("Golpe Consagrado",5,50));
        habilidades.add(new CuraCuerpoACuerpo("Llama Sagrada",3,20));
        habilidades.add(new DanioADistancia("Rezo Sanador",1,15));

        return habilidades;
    }
}