package rpg.model;

public class Habilidad {
    private int id;
    private String nombre;
    private int danoBase;
    private int usosMaximos;
    private int usosActuales;
    private Clase clase;

    public Habilidad(int id, String nombre, int danoBase, int usosMaximos, Clase clase) {
        this.id = id;
        this.nombre = nombre;
        this.danoBase = danoBase;
        this.usosMaximos = usosMaximos;
        this.usosActuales = usosMaximos;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUsosMaximos() {
        return usosMaximos;
    }

    public Clase getClase() {
        return clase;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public int getUsosActuales() {
        return usosActuales;
    }

    public void setUsosActuales(int usosActuales) {
        this.usosActuales = usosActuales;
    }

    public void setUsosMaximos(int usosMaximos) {
        this.usosMaximos = usosMaximos;
    }
}