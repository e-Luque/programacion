package rpg.ui;

import rpg.exception.BDException;
import rpg.exception.NivelInsuficienteException;
import rpg.logic.SistemaPersonajes;
import rpg.model.Ciudad;
import rpg.model.Clase;
import rpg.model.Personaje;
import rpg.model.Raza;
import rpg.utils.GestionDatos;

import java.util.Scanner;

public class MenuPersonajes {
    private GestionDatos datos;
    private Scanner scanner;
    private SistemaPersonajes sistema;
    public MenuPersonajes(GestionDatos datos){
        this.datos = datos;
        this.scanner = new Scanner(System.in);
        this.sistema = new SistemaPersonajes();
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
            Scanner s = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    // NOMBRE
                    System.out.println("--- CREAR PERSONAJE ---");
                    System.out.print("Nombre: ");
                    String nombre = s.nextLine();

                    // RAZAS
                    for(int i=0; i < datos.getListaRazas().size(); i++) {
                        System.out.println(i + ". " + datos.getListaRazas().get(i).getNombre());
                    }
                    System.out.print("Elige raza (índice): ");
                    Raza razaSel = datos.getListaRazas().get(s.nextInt());

                    // CLASES
                    for(int i=0; i < datos.getListaClases().size(); i++) {
                        System.out.println(i + ". " + datos.getListaClases().get(i).getNombre());
                    }
                    System.out.print("Elige clase (índice): ");
                    Clase claseSel = datos.getListaClases().get(s.nextInt());

                    //CIUDADES
                    for(int i=0; i < datos.getListaCiudades().size(); i++) {
                        System.out.println(i + ". " + datos.getListaCiudades().get(i).getNombre());
                    }
                    System.out.print("Elige ciudad (índice): ");
                    Ciudad ciudadSel = datos.getListaCiudades().get(s.nextInt());

                    //CREAMOS PERSONAJE

                    sistema.crearNuevoPersonaje(nombre, razaSel, claseSel, ciudadSel, datos.getListaPersonajes());
                    break;
                case 2:
                    System.out.println("--- VIAJAR A CIUDAD ---");

                    //ELEGIR PERSONAJE
                    for(int i=0; i < datos.getListaPersonajes().size(); i++) {
                        System.out.println(i + ". " + datos.getListaPersonajes().get(i).getNombre());
                    }
                    System.out.print("Elije personaje (indice): ");
                    Personaje personajeSel = datos.getListaPersonajes().get(s.nextInt());

                    //ELEGIR CIUDAD
                    for(int i=0; i < datos.getListaCiudades().size(); i++) {
                        System.out.println(i + ". " + datos.getListaCiudades().get(i).getNombre());
                    }
                    System.out.print("Elige ciudad (índice): ");
                    Ciudad ciudadViaje = datos.getListaCiudades().get(s.nextInt());

                    //VIAJAMOS AL PERSONAJE
                    try {
                        sistema.viajar(personajeSel, ciudadViaje);
                    } catch (NivelInsuficienteException e) {
                        System.out.println("\n[!] ERROR DE VIAJE: " + e.getMessage() + "\n");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("SE HA ESCOGIDO UNA OPCIÓN INCORRECTA, SE VA A REGRESAR AL MENU PRINCIPAL...");
            }
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
        }
    }
}
