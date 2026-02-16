import java.util.ArrayList;

public class Canciones {
    private String nombre;
    private ArrayList<Artistas> autor;
    public Canciones(String nombre){
        this.nombre = nombre;
        this.autor = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Artistas> getAutor() {
        return autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(ArrayList<Artistas> autor) {
        this.autor = autor;
    }
    public boolean generaRegalias(){
        return true
    }
}
