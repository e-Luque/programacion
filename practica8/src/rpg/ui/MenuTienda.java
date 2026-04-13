package rpg.ui;

import rpg.exception.FondosInsuficientesException;
import rpg.logic.SistemaTienda;
import rpg.model.Item;
import rpg.model.Personaje;
import rpg.utils.GestionDatos;

import java.util.Scanner;

public class MenuTienda {
    private Scanner scanner;
    private GestionDatos datos;
    public MenuTienda(GestionDatos datos){
        this.datos = datos;
        this.scanner = new Scanner(System.in);
        mostrarTienda();
    }
    public void mostrarTienda() {
        System.out.println("--- BIENVENIDO A LA TIENDA ---");

        // 1. Elegir quién compra
        for (int i = 0; i < datos.getListaPersonajes().size(); i++) {
            System.out.println(i + ". " + datos.getListaPersonajes().get(i).getNombre()
                    + " (Oro: " + datos.getListaPersonajes().get(i).getOro() + ")");
        }
        Personaje comprador = datos.getListaPersonajes().get(scanner.nextInt());

        // 2. Elegir qué compra
        for (int i = 0; i < datos.getListaItems().size(); i++) {
            Item it = datos.getListaItems().get(i);
            System.out.println(i + ". " + it.getNombre() + " - Precio: " + it.getPrecioOro());
        }
        Item itemElegido = datos.getListaItems().get(scanner.nextInt());

        // 3. Llamar a la lógica con try-catch
        try {
            SistemaTienda tienda = new SistemaTienda();
            tienda.comprarItem(comprador, itemElegido);
        } catch (FondosInsuficientesException e) {
            System.out.println("TIENDA: " + e.getMessage());
        }
    }
}
