
import com.juego.clases.Bardo;
import com.juego.clases.Guerrero;
import com.juego.modelo.Combate;
import com.juego.modelo.Personaje;
import com.juego.presentacion.VistaCombate;
import com.juego.razas.Humano;

public class Main{
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Luque", new Humano(), new Bardo());
        Personaje personaje2 = new Personaje("Rey", new Humano(), new Guerrero());
        VistaCombate vistaCombate = new VistaCombate();
        vistaCombate.iniciarCombate(personaje1,personaje2);
    }
}