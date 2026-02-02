import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bloque1 {
    private ArrayList<String> registroMuertes;
    private HashSet<String> villanos;
    private HashMap<String, Integer> heroesOro;
    public Bloque1(){
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
        this.heroesOro.put("Evelyn",1000);
        this.heroesOro.put("Rey",1500);
        this.heroesOro.put("Pepe",500);
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
    public ArrayList<String> mostrarTerceroRegistro(){
        return getRegistroMuertes().get(2);
    }
}
