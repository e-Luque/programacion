import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de estudiantes con sus respectivas notas.
        // El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).

        Scanner scanner = new Scanner(System.in);
        // Utiliza un array para los nombres de los alumnos y otro para las notas.
        String[] nombres = {"Evelyn", "Cristian", "María"};
        double[] notas = {8.5, 7.0, 9.2};

        System.out.print("Nombre del alumno: ");
        String nombre = scanner.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombre)) {
                System.out.println("Nota de " + nombres[i] + ": " + notas[i]);
            }
        }
        //¿Serías capaz de hacerlo con un array BIdimensional?
        //Actualmente no
    }
}