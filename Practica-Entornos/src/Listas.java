import java.util.HashSet;

public class Listas {
    private String nombreLista;
    private Oyentes autorLista;
    private HashSet<Canciones> canciones;
    public Listas(String nombreLista, Oyentes autorLista){
        this.nombreLista = nombreLista;
        this.autorLista = autorLista;
        this.canciones = new HashSet<>();
    }
}
