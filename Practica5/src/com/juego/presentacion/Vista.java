package com.juego.presentacion;

import com.juego.clases.*;
import com.juego.modelo.Combate;
import com.juego.modelo.GestorPersonajes;
import com.juego.modelo.Personaje;
import com.juego.razas.Elfo;
import com.juego.razas.Enano;
import com.juego.razas.Humano;
import com.juego.razas.Razas;

import java.util.Scanner;

public class Vista {
    private Personaje personaje1;
    private Personaje personaje2;
    public Vista(){
    }
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        GestorPersonajes gestor = new GestorPersonajes();

        while (opcion != 3) {
            System.out.println("=======================================");
            System.out.println("          MENU PRINCIPAL");
            System.out.println("=======================================");
            System.out.println("1) Jugar");
            System.out.println("2) Crear nuevo personaje");
            System.out.println("3) Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            System.out.println();

            if (opcion == 1) {
                // Selección de personaje jugador 1
                System.out.println("=======================================");
                System.out.println("         SELECCIONA JUGADOR 1");
                System.out.println("=======================================");
                for (int j = 0; j < gestor.getPersonajes().size(); j++) {
                    System.out.printf("%d) %s\n", j, gestor.getPersonajes().get(j).getNombre());
                }
                System.out.print("ID del personaje: ");
                int PersonajeID = scanner.nextInt();
                personaje1 = gestor.getPersonajes().get(PersonajeID);
                gestor.getPersonajes().remove(PersonajeID);
                System.out.println(personaje1.getNombre() + " seleccionado para jugador 1.\n");

                // Selección de personaje jugador 2
                System.out.println("=======================================");
                System.out.println("         SELECCIONA JUGADOR 2");
                System.out.println("=======================================");
                for (int j = 0; j < gestor.getPersonajes().size(); j++) {
                    System.out.printf("%d) %s\n", j, gestor.getPersonajes().get(j).getNombre());
                }
                System.out.print("ID del personaje: ");
                PersonajeID = scanner.nextInt();
                personaje2 = gestor.getPersonajes().get(PersonajeID);
                gestor.getPersonajes().remove(PersonajeID);
                System.out.println(personaje2.getNombre() + " seleccionado para jugador 2.\n");

                // Iniciar combate
                Combate vistaCombate = new Combate();
                vistaCombate.iniciarCombate(personaje1, personaje2);
                break;

            } else if (opcion == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.println("=======================================");
                System.out.println("        CREAR NUEVO PERSONAJE");
                System.out.println("=======================================");
                System.out.print("Introduce el nombre del personaje: ");
                String nombre = sc.nextLine();

                // Elegir raza
                System.out.println("\nElige raza:");
                System.out.println("1) Humano");
                System.out.println("2) Elfo");
                System.out.println("3) Enano");
                System.out.print("Opción: ");
                Razas raza = null;
                int opcionRaza = sc.nextInt();
                switch (opcionRaza) {
                    case 1: raza = new Humano(); break;
                    case 2: raza = new Elfo(); break;
                    case 3: raza = new Enano(); break;
                    default: System.out.println("Opción inválida, se asigna Humano."); raza = new Humano();
                }

                // Elegir clase
                System.out.println("\nElige clase:");
                System.out.println("1) Bardo");
                System.out.println("2) Guerrero");
                System.out.println("3) Druida");
                System.out.println("4) Mago");
                System.out.println("5) Monje");
                System.out.println("6) Paladín");
                System.out.println("7) Pícaro");
                System.out.println("8) Sacerdote");
                System.out.print("Opción: ");
                Clases clase = null;
                int opcionClase = sc.nextInt();
                switch (opcionClase) {
                    case 1: clase = new Bardo(); break;
                    case 2: clase = new Guerrero(); break;
                    case 3: clase = new Druida(); break;
                    case 4: clase = new Mago(); break;
                    case 5: clase = new Monje(); break;
                    case 6: clase = new Paladin(); break;
                    case 7: clase = new Picaro(); break;
                    case 8: clase = new Sacerdote(); break;
                    default: System.out.println("Opción inválida, se asigna Guerrero."); clase = new Guerrero();
                }

                // Crear personaje
                Personaje personajeCreado = new Personaje(nombre, raza, clase);
                gestor.agregarPersonaje(personajeCreado);
                System.out.println("\nPersonaje " + nombre + " creado con éxito!\n");
            }
        }

        System.out.println("\n¡Gracias por jugar! Hasta la próxima.");
    }

}
