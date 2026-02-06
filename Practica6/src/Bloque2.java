import java.util.ArrayList;
import java.util.HashMap;

public class Bloque2 {
    private HashMap<String, ArrayList<String>> repositorioGremios;
    public Bloque2(){
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
        this.repositorioGremios.put("Guerreros", guerreros);
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

}
