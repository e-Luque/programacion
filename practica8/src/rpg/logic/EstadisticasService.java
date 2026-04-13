package rpg.logic;
import rpg.model.Personaje;
import java.util.*;

public class EstadisticasService {
    public void mostrarTopRicos(List<Personaje> personajes) {
        personajes.sort((p1, p2) -> Integer.compare(p2.getOro(), p1.getOro()));
        System.out.println("--- TOP 3 MÁS RICOS ---");
        personajes.stream().limit(3).forEach(p ->
                System.out.println(p.getNombre() + ": " + p.getOro() + " monedas"));
    }

    public void censoClases(List<Personaje> personajes) {
        Map<String, Integer> censo = new HashMap<>();
        for (Personaje p : personajes) {
            String clase = p.getClase().getNombre();
            censo.put(clase, censo.getOrDefault(clase, 0) + 1);
        }
        System.out.println("Censo: " + censo);
    }
}