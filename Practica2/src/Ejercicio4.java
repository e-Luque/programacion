import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100
        int[] arrayInt = new int[100];
        int Suma = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;

        }
        //Obtén la suma de todos ellos y la media.
        for (int i = 0; i < arrayInt.length; i++) {
            Suma += arrayInt[i];
        }
        System.out.println("La suma de los numeros es: "+ Suma);
        int Media = Suma/arrayInt.length;
        System.out.println("La media de esos numeros es: "+ Media);

    }
}
