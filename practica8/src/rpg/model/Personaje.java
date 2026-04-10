package rpg.model;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vidaActual;
    private Raza raza;
    private Clase clase;
    private Ciudad ciudad;

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
    }
}
