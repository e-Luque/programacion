package rpg.model;

public class Habilidad {
    private int id;
    private String nombre;
    private int danoBase;
    private int usosMaximos;
    private Clase clase;

    public Habilidad(int id, String nombre, int danoBase, int usosMaximos, Clase clase) {
        this.id = id;
        this.nombre = nombre;
        this.danoBase = danoBase;
        this.usosMaximos = usosMaximos;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}