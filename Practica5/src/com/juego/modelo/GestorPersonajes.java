package com.juego.modelo;

import com.juego.clases.*;
import com.juego.razas.*;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonajes {

    private List<Personaje> personajes;

    public GestorPersonajes() {
        personajes = new ArrayList<>();
        precargarPersonajes();
    }

    private void precargarPersonajes() {

        // Razas
        Razas humano = new Humano();
        Razas elfo = new Elfo();
        Razas enano = new Enano();

        // Clases
        Clases guerrero = new Guerrero();
        Clases mago = new Mago();
        Clases bardo = new Bardo();

        // Personajes precargados
        personajes.add(new Personaje("Rey", new Humano(), new Guerrero()));
        personajes.add(new Personaje("Luque", new Humanoide(), new Robot()));
        personajes.add(new Personaje("Josemi", new Elfo(), new Druida()));
        personajes.add(new Personaje("Pablo", new Humano(),new Paladin()));
        personajes.add(new Personaje("Julia", new Enano(),new Mago()));
        personajes.add(new Personaje("Fran", new Humano(),new Sacerdote()));
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public Personaje getPersonaje(int indice) {
        if (indice >= 0 && indice < personajes.size()) {
            return personajes.get(indice);
        }
        return null;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}
