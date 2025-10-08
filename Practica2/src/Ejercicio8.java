import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce el número de personas: ");
            N = scanner.nextInt();
        } while (N <= 0);
        double[] alturas = new double[N];
        double suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Introduce la altura de la persona " + (i + 1) + " (en metros): ");
            alturas[i] = scanner.nextDouble();
            suma += alturas[i];
        }
        double media = suma / N;
        System.out.println("Altura media: "+media+ " metros");
        int superiores = 0;
        int inferiores = 0;
        for (double altura : alturas) {
            if (altura >= media) {
                superiores++;
            } else if (altura < media) {
                inferiores++;
            }
        }
        System.out.println("Personas con altura superior a la media: " + superiores);
        System.out.println("Personas con altura inferior a la media: " + inferiores);
    }
}
