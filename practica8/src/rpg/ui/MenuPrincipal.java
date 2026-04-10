package rpg.ui;


import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;
    public MenuPrincipal(){
        this.scanner = new Scanner(System.in);
        cargarMenu();
    }
    public void cargarMenu(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║          XRPG EN JAVA          ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 1. Gestionar Personajes        ║");
        System.out.println("║ 2. Tienda de objetos           ║");
        System.out.println("║ 3. Combate                     ║");
        System.out.println("║ 4. Créditos                    ║");
        System.out.println("║ 5. Salir                       ║");
        System.out.println("╚════════════════════════════════╝");

        int opcion = 0;

        while(opcion != 5) {
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    MenuPersonajes menuPersonajes = new MenuPersonajes();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Creado por: Cristian Luque Ruiz");
                    System.out.println("GitHub: https://github.com/e-Luque/programacion");
                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("SE HA ESCOGIDO UNA OPCIÓN INCORRECTA, EJECUTE DE NUEVO Y VUELVA A INTENTARLO");
                    break;
            }
        }

    }
}
