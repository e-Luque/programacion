import com.rpg.handler.RPGDataException;
import com.rpg.services.GestionMundo;

import java.util.List;

public class Main {
    public static void main(String[] args) throws RPGDataException {
        GestionMundo mundo = new GestionMundo();
        mundo.cargarTodo();
        for (int i = 0; i < mundo.getListaCiudades().size(); i++) {
            System.out.println(mundo.getListaCiudades().get(i).getNombre());
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < mundo.getListaPersonajes().size(); i++) {
            System.out.println(mundo.getListaPersonajes().get(i).getNombre());
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < mundo.getListaItems().size(); i++) {
            System.out.println(mundo.getListaItems().get(i).getNombre());
        }
        mundo.crearPersonaje("Evelyn","Humana",5, List.of("W01","P01"));
    }
}
