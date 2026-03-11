package com.rpg.services;

import com.rpg.handler.DatoInvalidoException;
import com.rpg.handler.RPGDataException;
import com.rpg.handler.RecursoNoEncontradoException;
import com.rpg.model.Ciudades;
import com.rpg.model.Items;
import com.rpg.model.Personajes;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.TxtHelper;

import java.util.List;
import java.util.Scanner;

public class GestionMundo {
    private List<Ciudades> listaCiudades;
    private List<Personajes> listaPersonajes;
    private List<Items> listaItems;
    public GestionMundo(){
    }
    public void cargarTodo() throws RPGDataException{
        try{
            TxtHelper txtHelper = new TxtHelper();
            listaCiudades = txtHelper.leerCiudades();
            JsonHelper jsonHelper = new JsonHelper();
            listaPersonajes = jsonHelper.leerPersonajes();
            listaItems = jsonHelper.leerItems();

            for (int i = 0; i < listaPersonajes.size(); i++) {
                if (listaPersonajes.get(i).getNivel()<0){
                    throw new DatoInvalidoException("Dato Invalido");
                }
            }
        }
        catch (DatoInvalidoException e){
            System.err.println("Nivel Invalido");
        }
    }
    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItems) throws RPGDataException {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Introduzca el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Introduzca el nivel");
            Integer nivel = scanner.nextInt();
            if (nivel < 0){
                throw new DatoInvalidoException("Nivel Invalido");
            }
            System.out.println("Introduzca el ID del equipo");
            for (int i = 0; i < listaItems.size(); i++) {
                System.out.println(listaItems.get(i).getId() + " - " + listaItems.get(i).getNombre());
            }
            String ID = scanner.nextLine();
            if (!listaItems.contains(ID)){
                throw new RecursoNoEncontradoException("El Item no Existe");
            }
        }
    }

    public List<Ciudades> getListaCiudades() {
        return listaCiudades;
    }

    public List<Items> getListaItems() {
        return listaItems;
    }

    public List<Personajes> getListaPersonajes() {
        return listaPersonajes;
    }

    public void setListaCiudades(List<Ciudades> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public void setListaPersonajes(List<Personajes> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    public void setListaItems(List<Items> listaItems) {
        this.listaItems = listaItems;
    }
}
