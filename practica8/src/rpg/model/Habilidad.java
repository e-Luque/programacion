package rpg.model;

public class Habilidad {
    private int id;
    private String nombre;
    private int danoBase;
    private int usosMaximos;
    private int idClase;

    public Habilidad(int id, String nombre, int danoBase, int usosMaximos, int idClase) {
        this.id = id;
        this.nombre = nombre;
        this.danoBase = danoBase;
        this.usosMaximos = usosMaximos;
        this.idClase = idClase;
    }
}