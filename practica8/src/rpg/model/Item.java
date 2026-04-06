package rpg.model;

public class Item {
    private int id;
    private String nombre;
    private String tipo;
    private int precioOro;
    private int bonificadorAtaque;
    private int bonificadorDefensa;

    public Item(int id, String nombre, String tipo, int precioOro, int bonificadorAtaque, int bonificadorDefensa) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioOro = precioOro;
        this.bonificadorAtaque = bonificadorAtaque;
        this.bonificadorDefensa = bonificadorDefensa;
    }
}
