import java.util.ArrayList;
import java.util.HashMap;

public class Bloque3 {
    private HashMap<String, Double> preciosBase;
    private HashMap<String, ArrayList<String>> ciudadesStock;
    private HashMap<String, HashMap<String, Boolean>> claseHabilidades;
    public Bloque3(){
        //------------------------------------
        //El Sistema de Comercio y Precios Dinámicos
        this.preciosBase = new HashMap<>();
        preciosBase.put("Espada", 100.0);
        preciosBase.put("Escudo", 80.0);
        preciosBase.put("Poción", 25.0);
        preciosBase.put("Armadura", 200.0);
        preciosBase.put("Anillo", 150.0);
        preciosBase.put("Casco", 60.0);
        this.ciudadesStock = new HashMap<>();
        ArrayList<String> itemsCapital = new ArrayList<>();
        itemsCapital.add("Espada");
        itemsCapital.add("Escudo");
        itemsCapital.add("Poción");
        itemsCapital.add("Armadura");
        itemsCapital.add("Anillo");
        itemsCapital.add("Casco");
        ciudadesStock.put("Capital", itemsCapital);
        ArrayList<String> itemsPueblo = new ArrayList<>();
        itemsPueblo.add("Espada");
        itemsPueblo.add("Poción");
        ciudadesStock.put("Pueblo", itemsPueblo);
        //--------------------------------------
        //Gestión de Árboles de Habilidades (Nested Maps)
        this.claseHabilidades = new HashMap<>();
        HashMap<String, Boolean> paladinHabilidades = new HashMap<>();
        paladinHabilidades.put("Golpe Sagrado", true);
        paladinHabilidades.put("Escudo Divino", false);
        paladinHabilidades.put("Aura de Protección", false);
        paladinHabilidades.put("Luz Sanadora", false);
        claseHabilidades.put("Paladín", paladinHabilidades);
        HashMap<String, Boolean> magoHabilidades = new HashMap<>();
        magoHabilidades.put("Bola de Fuego", true);
        magoHabilidades.put("Teletransporte", false);
        magoHabilidades.put("Tormenta Arcana", false);
        magoHabilidades.put("Escudo Mágico", false);
        claseHabilidades.put("Mago", magoHabilidades);
    }
    public void calcularPreciosTransaccion(String nombreCiudad) {
        if (!ciudadesStock.containsKey(nombreCiudad)) {
            System.out.println("La ciudad no existe.");
            return;
        }
        ArrayList<String> stock = ciudadesStock.get(nombreCiudad);
        boolean impuestoLujo = stock.size() > 5;
        System.out.println("Precios en " + nombreCiudad + ":");
        for (String item : stock) {
            if (!preciosBase.containsKey(item)) continue;
            double precioFinal = preciosBase.get(item);
            if (impuestoLujo) {
                precioFinal *= 1.10; // +10%
            }
            System.out.println(item + " -> " + precioFinal);
        }
        if (impuestoLujo) {
            System.out.println("Se ha aplicado el impuesto de lujo (10%).");
        }
    }
    public void desbloquearHabilidad(String clase, String habilidad){
        if(!claseHabilidades.containsKey(clase)){
            System.out.println("No existe esa clase");
            return;
        }

    }
}
