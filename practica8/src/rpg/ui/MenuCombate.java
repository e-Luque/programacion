package rpg.ui;

import rpg.logic.MotorCombate;
import rpg.model.Habilidad;
import rpg.model.Personaje;
import rpg.utils.GestionDatos;

import java.util.List;
import java.util.Scanner;

public class MenuCombate {
    private GestionDatos datos;
    private Scanner sc;
    private MotorCombate motor;

    public MenuCombate(GestionDatos datos) {
        this.datos = datos;
        this.sc = new Scanner(System.in);
        this.motor = new MotorCombate();
        iniciarSeleccion();
    }

    private void iniciarSeleccion() {
        System.out.println("Seleccione Jugador 1:");
        listarPersonajes();
        Personaje p1 = datos.getListaPersonajes().get(sc.nextInt());

        System.out.println("Seleccione Jugador 2:");
        listarPersonajes();
        Personaje p2 = datos.getListaPersonajes().get(sc.nextInt());

        bucleCombate(p1, p2);
    }

    private void bucleCombate(Personaje p1, Personaje p2) {
        while (p1.getVidaActual() > 0 && p2.getVidaActual() > 0) {
            ejecutarTurno(p1, p2);
            if (p2.getVidaActual() <= 0) {
                break;
            }
            ejecutarTurno(p2, p1);
        }

        if (p1.getVidaActual() > 0) {
            motor.procesarFinCombate(p1, p2);
        }
        else {
            motor.procesarFinCombate(p2, p1);
        }
    }

    private void ejecutarTurno(Personaje activo, Personaje pasivo) {
        System.out.println("\nTurno de " + activo.getNombre() + " (HP: " + activo.getVidaActual() + ")");
        System.out.println("1. Usar Habilidad\n2. Ataque Básico");
        int op = sc.nextInt();

        if (op == 1 && activo.getHabilidades().size() != 0) {
            // Mostrar habilidades que tengan usosActuales > 0
            List<Habilidad> habs = activo.getHabilidades();
            for (int i = 0; i < habs.size(); i++) {
                System.out.println(i + ". " + habs.get(i).getNombre() + " (Usos: " + habs.get(i).getUsosActuales() + ")");
            }
            int hSel = sc.nextInt();
            motor.atacarConHabilidad(activo, pasivo, habs.get(hSel));
        } else {
            motor.ataqueBasico(activo, pasivo);
        }
    }

    private void listarPersonajes() {
        for (int i = 0; i < datos.getListaPersonajes().size(); i++) {
            System.out.println(i + ". " + datos.getListaPersonajes().get(i).getNombre());
        }
    }
}