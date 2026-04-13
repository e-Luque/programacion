package rpg.logic;
import rpg.model.Personaje;
import java.util.Iterator;
import java.util.List;

public class SistemaEventos {
    public void cobrarImpuestos(List<Personaje> personajes) {
        Iterator<Personaje> it = personajes.iterator();
        while (it.hasNext()) {
            Personaje p = it.next();
            if (p.getOro() >= 10) {
                p.setOro(p.getOro() - 10);
                System.out.println(p.getNombre() + " ha pagado 10 de oro.");
            } else {
                System.out.println(p.getNombre() + " no tiene dinero y es desterrado.");
                it.remove(); // Requisito del PDF
            }
        }
    }
}