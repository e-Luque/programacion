package com.juego.habilidades;

public class HabilidadBase implements Habilidades {

    private String nombre;
    private int usosMaximos;
    private int usosRestantes;
    private int valor;

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

    public void consumirUso() {
        usosRestantes--;
    }
}