import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Canciones> canciones;
    private ArrayList<Podcasts> podcasts;
    private ArrayList<Audiolibros> audiolibros;
    public Catalogo(){
        this.canciones = new ArrayList<>();
        this.podcasts = new ArrayList<>();
        this.audiolibros = new ArrayList<>();
    }

    public ArrayList<Audiolibros> getAudiolibros() {
        return audiolibros;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public ArrayList<Podcasts> getPodcasts() {
        return podcasts;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public void setAudiolibros(ArrayList<Audiolibros> audiolibros) {
        this.audiolibros = audiolibros;
    }

    public void setPodcasts(ArrayList<Podcasts> podcasts) {
        this.podcasts = podcasts;
    }
}
