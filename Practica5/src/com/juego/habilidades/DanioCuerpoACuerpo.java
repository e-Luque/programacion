package com.juego.habilidades;

public class DanioCuerpoACuerpo implements Habilidades {
    private String nombre;
    private int usosMaximos;
    private int usosRestantes;
    private int valor;

    public DanioCuerpoACuerpo(String nombre, int usosMaximos, int valor) {
        this.nombre = nombre;
        this.usosMaximos = usosMaximos;
        this.usosRestantes = this.usosMaximos;
        this.valor = valor;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getUsosRestantes() {
        return this.usosRestantes;
    }

    @Override
    public boolean sePuedeUsar() {
        return this.usosRestantes>0;
    }

    @Override
    public int aplicar() {
        if (!sePuedeUsar()) {
            return valor;
        }
        return 0;
    }
}