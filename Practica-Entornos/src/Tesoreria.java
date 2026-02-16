import java.util.ArrayList;

public class Tesoreria {
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
    public boolean esMonetizable(String nombre){
        for (int i = 0; i < canciones.size(); i++) {
            if (nombre.equals(canciones.get(i).getNombre())){
                return canciones.get(i).generaRegalias();
            }
        }
        for (int i = 0; i < podcasts.size(); i++) {
            if (nombre.equals(podcasts.get(i).getNombre())){
                return podcasts.get(i).generaRegalias();
            }
        }
        for (int i = 0; i < audiolibros.size(); i++) {
            if (nombre.equals(audiolibros.get(i).getNombre())){
                return audiolibros.get(i).generaRegalias();
            }
        }
    }
}
