package rpg.model;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vidaActual;
    private int idRaza;
    private int idClase;
    private int idCiudadActual;

    public Personaje(int id, String nombre, int nivel, int oro, int vidaActual,
                     int idRaza, int idClase, int idCiudadActual) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vidaActual = vidaActual;
        this.idRaza = idRaza;
        this.idClase = idClase;
        this.idCiudadActual = idCiudadActual;
    }
}
