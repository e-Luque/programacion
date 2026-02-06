import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bloque1 {
    private ArrayList<String> registroMuertes;
    private HashSet<String> villanos;
    private HashMap<String, Integer> heroesOro;
    private HashMap<String, Double> mercadoHechizos;

    public Bloque1() {
        //El registro de muertes
        this.registroMuertes = new ArrayList<>();
        this.registroMuertes.add("Orco derrotado");
        this.registroMuertes.add("Poción usada");
        this.registroMuertes.add("Pasiva utilizada");
        this.registroMuertes.add("Jugador Caido");
        this.registroMuertes.add("Nuevo miembro en el equipo");
        //--------------------------------------
        //El censo único
        this.villanos = new HashSet<>();
        this.villanos.add("Morgoth");
        this.villanos.add("Morgoth");
        this.villanos.add("Jose Miguel");
        //--------------------------------------
        //Bolsa de oro
        this.heroesOro = new HashMap<>();
        this.heroesOro.put("Evelyn", 1000);
        this.heroesOro.put("Rey", 1500);
        this.heroesOro.put("Pepe", 500);
        //--------------------------------------
        //Mercado de hechizos
        this.mercadoHechizos = new HashMap<>();
        this.mercadoHechizos.put("Bola de Fuego", 30.0);
        this.mercadoHechizos.put("Cadena de Relámpagos", 45.0);
        this.mercadoHechizos.put("Muro de raices ancestrales", 55.0);
        this.mercadoHechizos.put("Resurrección menor", 65.0);
        this.mercadoHechizos.put("Apocalipsis arcano", 100.0);
    }

    public ArrayList<String> getRegistroMuertes() {
        return registroMuertes;
    }

    public HashSet<String> getVillanos() {
        return villanos;
    }

    public HashMap<String, Integer> getHeroesOro() {
        return heroesOro;
    }

    public String mostrarTerceroRegistro() {
        return this.registroMuertes.get(2);
    }

    //--------------------------------------
    //Limpieza del calabozo
    public void eliminarEvento(String nuevoEvento) {
        this.registroMuertes.removeFirst();
        this.registroMuertes.add(nuevoEvento);
        System.out.println("Evento: " + nuevoEvento + " añadido.");
    }

    public HashMap<String, Double> getMercadoHechizos() {
        return mercadoHechizos;
    }

    public void getHechizos50() {
        for (String hechizo : mercadoHechizos.keySet()) {
            Double precio = mercadoHechizos.get(hechizo);

            if (precio > 50) {
                System.out.println(hechizo);
            }
        }
    }
    public void eliminarVillano(String villanoAEliminar){
        if (villanos.contains(villanoAEliminar)){
            villanos.remove(villanoAEliminar);
            System.out.println("Villano eliminado con exito!");
        }
        else {
            System.out.println("Ese villano no existe");
        }
    }
}

