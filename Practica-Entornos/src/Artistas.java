public class Artistas {
    private String nombre;
    private int codigoArtista;
    public Artistas(String nombre, int codigoArtista){
        this.nombre = nombre;
        this.codigoArtista = codigoArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoArtista() {
        return codigoArtista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoArtista(int codigoArtista) {
        this.codigoArtista = codigoArtista;
    }
}
