import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args) {
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        Scanner scanner = new Scanner(System.in);
        //Crea un array de 10 posiciones de números con valores pedidos por teclado.
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Introduce el valor Nº" + (i + 1));
            arrayInt[i] = scanner.nextInt();
        }
        //A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]>0){
                System.out.println("El numero "+arrayInt[i]+" es positivo");
            }
            if (arrayInt[i]==0){
                System.out.println("El numero "+arrayInt[i]+" es nulo");
            }
            if (arrayInt[i]<0){
                System.out.println("El numero "+arrayInt[i]+" es negativo");
            }
        }
    }

}