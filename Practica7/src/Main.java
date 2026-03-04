import com.rpg.services.GestionMundo;

public class Main {
    public static void main(String[] args) {
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
    }
}
