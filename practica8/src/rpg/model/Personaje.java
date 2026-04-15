package rpg.model;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vidaActual;
    private Raza raza;
    private Clase clase;
    private Ciudad ciudad;
    private List<Habilidad> habilidades;
    private List<Item> inventario;

    public Personaje(int id, String nombre, int nivel, int oro, int vidaActual,
                     Raza raza, Clase clase, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vidaActual = vidaActual;
        this.raza = raza;
        this.clase = clase;
        this.ciudad = ciudad;
        this.habilidades = new ArrayList<>();
        this.inventario = new ArrayList<>();
    }

    public void añadirHabilidad(Habilidad habilidad){
        habilidades.add(habilidad);
    }

    public void añadirItem(Item item) {
        this.inventario.add(item);
    }
    public int getId() {
        return id;
    }

    public Clase getClase() {
        return clase;
    }

    public int getOro() {
        return oro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public int getNivel() {
        return nivel;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }
    public List<Item> getInventario() {
        return inventario;
    }

    public void restablecerHabilidades() {
        for (Habilidad h : this.habilidades) {
            h.setUsosActuales(h.getUsosMaximos());
        }
    }
}
