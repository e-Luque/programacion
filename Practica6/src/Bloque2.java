import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bloque2 {
    private HashMap<String, ArrayList<String>> repositorioGremios;
    private HashMap<String, HashSet<String>> lootMonstruos;
    private HashMap<String, HashMap<String, Integer>> statsJugador;
    public Bloque2(){
        //----------------------------------------
        //El Repositorio de Gremios
        this.repositorioGremios = new HashMap<>();
        ArrayList<String> magos = new ArrayList<>();
        magos.add("Mercy");
        magos.add("Evelyn");
        magos.add("Julie");
        this.repositorioGremios.put("Magos",magos);
        ArrayList<String> guerreros = new ArrayList<>();
        guerreros.add("Rey");
        guerreros.add("Paul");
        guerreros.add("Joseph");
        guerreros.add("Judas");
        this.repositorioGremios.put("Guerreros", guerreros);
        //-----------------------------------------
        //El Sistema de Loot (Botín)
        this.lootMonstruos = new HashMap<>();
        HashSet<String> lootTrasgo = new HashSet<>();
        lootTrasgo.add("Espada Oxidada");
        lootTrasgo.add("Moneda de Cobre");
        lootTrasgo.add("Espada Oxidada");
        lootMonstruos.put("Trasgo", lootTrasgo);
        HashSet<String> lootDragon = new HashSet<>();
        lootDragon.add("Escama de Dragón");
        lootDragon.add("Oro");
        lootMonstruos.put("Dragón", lootDragon);
        //------------------------------------------
        //Rastreador de Estadísticas Complejas
        this.statsJugador = new HashMap<>();
        HashMap<String, Integer> statsConan = new HashMap<>();
        statsConan.put("Fuerza",10);
        statsConan.put("inteligencia",20);
        statsConan.put("Defensa",5);
        statsConan.put("Destreza",15);
        statsJugador.put("Conan",statsConan);
        //-------------------------------------------
        //El Buscador de Traidores

    }

    public HashMap<String, ArrayList<String>> getRepositorioGremios() {
        return repositorioGremios;
    }
    public void buscarGremio(String nombreGremio) {
        if (repositorioGremios.containsKey(nombreGremio)) {
            System.out.println("Miembros del gremio " + nombreGremio + ":");
            for (String miembro : repositorioGremios.get(nombreGremio)) {
                System.out.println("- " + miembro);

        }
        }
        else{
            System.out.println("El gremio \"" + nombreGremio + "\" no existe.");
        }
    }
    public void buscarBotin(String nombreEnemigo) {
        if(lootMonstruos.containsKey(nombreEnemigo)) {
            System.out.println("Objetos del enemigo: " + nombreEnemigo);
            for (String objeto : lootMonstruos.get(nombreEnemigo)) {
                System.out.println(" - "+ objeto);
            }
        }
        else {
            System.out.println("Ese enemigo no existe");
        }
    }
    public void modificarEstadisticas(String nombreJugador, String nombreEstadistica, Integer modificador) {
        if (statsJugador.containsKey(nombreJugador)) {
            HashMap<String, Integer> estadisticas = statsJugador.get(nombreJugador);
            if (estadisticas.containsKey(nombreEstadistica)) {
                int valorActual = estadisticas.get(nombreEstadistica);
                estadisticas.put(nombreEstadistica, valorActual + modificador);
                System.out.println("Estadística " + nombreEstadistica + " de " + nombreJugador + " modificada exitosamente!");
            } else {
                System.out.println("Esa estadística no existe o no se puede modificar");
            }
        } else {
            System.out.println("Ese jugador no existe");
        }
    }
    public void buscarTraidores(String nombreTraidor) {
        for (String nombreGremio : repositorioGremios.keySet()) {
            ArrayList<String> miembros = repositorioGremios.get(nombreGremio);
            if (miembros.contains(nombreTraidor)) {
                miembros.remove(nombreTraidor);
                System.out.println("¡Traidor encontrado! " + nombreTraidor + " estaba en el gremio: " + nombreGremio);
                return; // detener búsqueda
            }
        }
        System.out.println(nombreTraidor + " no fue encontrado en ningún gremio.");
    }
}
