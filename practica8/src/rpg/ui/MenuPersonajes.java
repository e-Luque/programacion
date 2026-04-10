package rpg.ui;

import java.util.Scanner;

public class MenuPersonajes {
    private Scanner scanner;
    public MenuPersonajes(){
        this.scanner = new Scanner(System.in);
        cargarMenu();
    }
    public void cargarMenu(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║      GESTOR DE PERSONAJES      ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 1. Crear nuevo personaje       ║");
        System.out.println("║ 2. Viajar a nueva ciudad       ║");
        System.out.println("║ 3. Volver                      ║");
        System.out.println("╚════════════════════════════════╝");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        while(opcion != 3){
            switch (opcion) {
                case 1:
                    MenuPersonajes menuPersonajes = new MenuPersonajes();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                default:
                    System.out.println("SE HA ESCOGIDO UNA OPCIÓN INCORRECTA, SE VA A REGRESAR AL MENU PRINCIPAL...");
            }
        }
    }
}
