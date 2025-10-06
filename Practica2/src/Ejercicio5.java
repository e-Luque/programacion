import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = scanner.nextInt();
        double[] arrayInt = new double[tamaño];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Math.random() * 9;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            suma += arrayInt[i];
        }


        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}
