import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Escribe un programa java que invierta el orden de los valores de un array.
        //Por invertir el orden de los valores de un array, me refiero que el último pasa a ser el primero,
        // el penúltimo el segundo y así sucesivamente.
        //PRUEBA CON UN ARRAY DE TAMAÑO 6.
        int[] Array = new int[6];
        int[] ArrayInversa = new int[6];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Introduce el Nº " + (i + 1) + ": ");
            Array[i] = scanner.nextInt();
        }
        for (int i = 0; i < Array.length; i++) {
            ArrayInversa[i] = Array[Array.length - 1 - i];
        }
        System.out.println("Array invertido:");
        for (int i = 0; i < ArrayInversa.length; i++) {
            System.out.println(ArrayInversa[i]);
        }
    }
}
