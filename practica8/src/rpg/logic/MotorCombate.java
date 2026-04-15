package rpg.logic;

import rpg.dao.PersonajeDAO;
import rpg.model.Habilidad;
import rpg.model.Item;
import rpg.model.Personaje;
import java.util.List;

public class MotorCombate {

    public void atacarConHabilidad(Personaje atacante, Personaje defensor, Habilidad hab) {
        int defensaDefensor = calcularDefensaTotal(defensor);
        int dano = hab.getDanoBase() - (defensaDefensor / 2);

        if (dano < 0) {
            dano = 0;
        }

        defensor.setVidaActual(defensor.getVidaActual() - dano);

        hab.setUsosActuales(hab.getUsosActuales() - 1);

        System.out.println(atacante.getNombre() + " usa " + hab.getNombre() + " haciendo " + dano + " de daño.");
    }

    public void ataqueBasico(Personaje atacante, Personaje defensor) {
        int ataqueAtacante = calcularAtaqueTotal(atacante);
        int defensaDefensor = calcularDefensaTotal(defensor);
        int dano = ataqueAtacante - (defensaDefensor / 2);

        if (dano < 0) {
            dano = 0;
        }
        defensor.setVidaActual(defensor.getVidaActual() - dano);
        System.out.println(atacante.getNombre() + " lanza un ataque básico haciendo " + dano + " de daño.");
    }

    public void procesarFinCombate(Personaje ganador, Personaje perdedor) {
        int robo = (int) (perdedor.getOro() * 0.20);
        ganador.setOro(ganador.getOro() + robo);
        perdedor.setOro(perdedor.getOro() - robo);


        PersonajeDAO pDAO = new PersonajeDAO();
        pDAO.actualizarPersonaje(ganador);
        pDAO.actualizarPersonaje(perdedor);

        ganador.restablecerHabilidades();
        perdedor.restablecerHabilidades();

        System.out.println("--- FIN DEL COMBATE ---");
        System.out.println(ganador.getNombre() + " roba " + robo + " de oro a " + perdedor.getNombre());
    }

    private int calcularDefensaTotal(Personaje p) {
        int defensaBase = p.getNivel() * 2;
        int bonificadorItems = 0;

        for (Item item : p.getInventario()) {
            bonificadorItems += item.getBonificadorDefensa();
        }

        return defensaBase + bonificadorItems;
    }

    private int calcularAtaqueTotal(Personaje p) {
        int ataqueBase = p.getNivel() * 5;
        int bonificadorItems = 0;

        for (Item item : p.getInventario()) {
            bonificadorItems += item.getBonificadorAtaque();
        }

        return ataqueBase + bonificadorItems;
    }
}