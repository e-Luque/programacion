package com.juego.habilidades;

public abstract class HabilidadBase implements Habilidades {

    protected String nombre;
    protected int usosMaximos;
    protected int usosRestantes;
    protected int valor;

    public HabilidadBase(String nombre, int usosMaximos, int valor) {
        this.nombre = nombre;
        this.usosMaximos = usosMaximos;
        this.usosRestantes = usosMaximos;
        this.valor = valor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getUsosRestantes() {
        return usosRestantes;
    }

    @Override
    public boolean sePuedeUsar() {
        return usosRestantes > 0;
    }

    protected void consumirUso() {
        usosRestantes--;
    }
}