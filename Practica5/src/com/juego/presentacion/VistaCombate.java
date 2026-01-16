package com.juego.presentacion;

import com.juego.modelo.Personaje;
import com.juego.clases.*;

import java.util.Scanner;

public class VistaCombate {
    private Scanner scanner = new Scanner(System.in);
    public VistaCombate() {
    }

    public void iniciarCombate(Personaje jugador1, Personaje jugador2){
        while (jugador1.getVida()>0 && jugador2.getVida()>0) {
            System.out.println("VIDA DE "+ jugador1.getNombre()+" : "+ jugador1.getVida());
            System.out.println("VIDA DE "+ jugador2.getNombre()+" : "+ jugador2.getVida());
            System.out.println("HABILIDADES DE "+jugador1.getNombre()+"\n-------------------------------");
            for (int i = 0; i < jugador1.getHabilidades().size(); i++) {
                System.out.println((i+1)+")"+jugador1.getHabilidades().get(i).getNombre());
            }
            System.out.println();
            int eleccion1 = scanner.nextInt();
            if (eleccion1 == 1){
                int efecto = jugador1.getHabilidades().get(0).aplicar();

                jugador2.recibirDanio(efecto);
            }
            System.out.println();
            System.out.println("HABILIDADES DE "+jugador2.getNombre()+"\n-------------------------------");

            for (int i = 0; i < jugador2.getHabilidades().size(); i++) {
                System.out.println((i+1)+")"+jugador2.getHabilidades().get(i).getNombre());
            }
            int eleccion2 = scanner.nextInt();
            if (eleccion2 == 1){
                jugador1.recibirDanio(jugador2.getHabilidades().get(0).aplicar());
            }
            System.out.println();
        }
    }
}
