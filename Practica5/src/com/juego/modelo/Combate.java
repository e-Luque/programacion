package com.juego.modelo;

import java.util.Scanner;

public class Combate {
    private Scanner scanner = new Scanner(System.in);
    public Combate() {
    }

    public void iniciarCombate(Personaje jugador1, Personaje jugador2){
        while (jugador1.getVida()>0 && jugador2.getVida()>0) {
            int contador = 1;
            // Mostrar vidas con un "barra de vida" visual
            System.out.println("=======================================");
            System.out.println("        ESTADO DEL COMBATE");
            System.out.println("=======================================");
            System.out.printf("%s : %d/%d HP\n", jugador1.getNombre(), jugador1.getVida(), jugador1.getVidaMaxima());
            System.out.printf("%s : %d/%d HP\n", jugador2.getNombre(), jugador2.getVida(), jugador2.getVidaMaxima());
            System.out.println("---------------------------------------");
            System.out.println("        TURNO: "+contador);
            System.out.println("---------------------------------------");
            // Habilidades de jugador1
            System.out.println("HABILIDADES DE " + jugador1.getNombre());
            for (int i = 0; i < jugador1.getHabilidades().size(); i++) {
                System.out.printf("%d) %s - Usos restantes: %d\n",
                        i+1,
                        jugador1.getHabilidades().get(i).getNombre(),
                        jugador1.getHabilidades().get(i).getUsosRestantes()
                );
            }
            System.out.print("Elige una habilidad: ");
            int eleccion1 = scanner.nextInt();

            if (eleccion1 == 1){
                int efecto = jugador1.getHabilidades().get(0).aplicar()* jugador1.getFuerza();
                jugador2.recibirDanio(efecto);
                System.out.println(jugador1.getNombre() + " usa " + jugador1.getHabilidades().get(0).getNombre() + " y causa " + efecto + " de daño!");
            }
            else if (eleccion1 == 2){
                int efecto = jugador1.getHabilidades().get(1).aplicar()* jugador1.getInteligencia();
                jugador1.curar(efecto);
                System.out.println(jugador1.getNombre() + " usa " + jugador1.getHabilidades().get(1).getNombre() + " y se cura " + efecto + " HP!");
            }
            else if (eleccion1 == 3){
                int efecto = jugador1.getHabilidades().get(2).aplicar()* jugador1.getDestreza();
                jugador2.recibirDanio(efecto);
                System.out.println(jugador1.getNombre() + " usa " + jugador1.getHabilidades().get(2).getNombre() + " y causa " + efecto + " de daño!");
            }

            else if (eleccion1 > 3 || eleccion1 < 1){
                System.out.println(jugador1.getNombre()+" ha fallado!");
            }

            System.out.println("---------------------------------------");

            // Habilidades de jugador2
            System.out.println("HABILIDADES DE " + jugador2.getNombre());
            for (int i = 0; i < jugador2.getHabilidades().size(); i++) {
                System.out.printf("%d) %s - Usos restantes: %d\n",
                        i+1,
                        jugador2.getHabilidades().get(i).getNombre(),
                        jugador2.getHabilidades().get(i).getUsosRestantes()
                );
            }
            System.out.print("Elige una habilidad: ");
            int eleccion2 = scanner.nextInt();
            if (eleccion2 == 1){
                int efecto = jugador2.getHabilidades().get(0).aplicar()* jugador2.getFuerza();
                jugador1.recibirDanio(efecto);
                System.out.println(jugador2.getNombre() + " usa " + jugador2.getHabilidades().get(0).getNombre() + " y causa " + efecto + " de daño!");
            }
            else if (eleccion2 == 2){
                int efecto = jugador2.getHabilidades().get(1).aplicar()* jugador2.getInteligencia();
                jugador2.curar(efecto);
                System.out.println(jugador2.getNombre() + " usa " + jugador2.getHabilidades().get(1).getNombre() + " y se cura " + efecto + " HP!");
            }
            else if (eleccion2 == 3){
                int efecto = jugador2.getHabilidades().get(2).aplicar()* jugador2.getDestreza();
                jugador1.recibirDanio(efecto);
                System.out.println(jugador2.getNombre() + " usa " + jugador2.getHabilidades().get(2).getNombre() + " y causa " + efecto + " de daño!");
            }
            else if (eleccion2 > 3 || eleccion2 < 1){
                System.out.println(jugador2.getNombre()+" ha fallado!");
            }
            contador++;

            System.out.println("=======================================\n");
        }

        // Mostrar ganador
        if (jugador1.getVida()==0 && jugador2.getVida()==0){
            System.out.println(jugador1.getNombre()+" y "+jugador2.getNombre()+" han caido... es un empate!");
        }
        else if (jugador1.getVida() <= 0) {
            System.out.println(jugador1.getNombre() + " ha sido derrotado! " + jugador2.getNombre() + " gana!");
        }
        else{
            System.out.println(jugador2.getNombre() + " ha sido derrotado! " + jugador1.getNombre() + " gana!");
        }
    }

}
