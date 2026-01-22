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

        // Personajes precargados
        personajes.add(new Personaje("Rey", new Humano(), new Guerrero()));
        personajes.add(new Personaje("Luque", new Humanoide(), new Robot()));
        personajes.add(new Personaje("Josemi", new Elfo(), new Druida()));
        personajes.add(new Personaje("Pablo", new Humano(),new Paladin()));
        personajes.add(new Personaje("Julia", new Enano(),new Mago()));
        personajes.add(new Personaje("Fran", new Humano(),new Sacerdote()));
        personajes.add(new Personaje("Álvaro",new Humano(),new Guerrero()));
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }


    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}
