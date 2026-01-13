package com.juego.modelo;

import com.juego.habilidades.Habilidades;

public class Combate {

    private Personaje luchador1;
    private Personaje luchador2;

    private Personaje turnoActual;
    private Personaje objetivo;

    public Combate(Personaje luchador1, Personaje luchador2) {
        this.luchador1 = luchador1;
        this.luchador2 = luchador2;
        this.turnoActual = luchador1;
        this.objetivo = luchador2;
    }

    // Devuelve el personaje cuyo turno es
    public Personaje getTurnoActual() {
        return turnoActual;
    }

    // Devuelve el enemigo del turno actual
    public Personaje getObjetivo() {
        return objetivo;
    }

    // Ejecuta una habilidad elegida por el jugador
    public void ejecutarHabilidad(Habilidades habilidad) {

        if (!habilidad.sePuedeUsar()) {
            return;
        }

        int efecto = habilidad.aplicar();

        if (efecto < 0) {
            objetivo.recibirDanio(-efecto);
        } else {
            turnoActual.curar(efecto);
        }

        cambiarTurno();
    }

    private void cambiarTurno() {
        if (turnoActual == luchador1) {
            turnoActual = luchador2;
            objetivo = luchador1;
        } else {
            turnoActual = luchador1;
            objetivo = luchador2;
        }
    }

    public boolean combateTerminado() {
        return luchador1.getVida() <= 0 || luchador2.getVidaA() <= 0;
    }

    public Personaje getGanador() {
        if (luchador1.getVida() > 0) {
            return luchador1;
        } else if (luchador2.getVida() > 0) {
            return luchador2;
        }
        return null;
    }
}
