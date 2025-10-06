import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        //Muestra por pantalla todos los elementos de un array de números enteros separados por un espacio.
        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Introduce el valor Nº"+(i+1));
            arrayInt[i] = scanner.nextInt();
        }
        for(int i=0; i<10; i++){
            System.out.print(arrayInt[i]+" ");
        }

    }
}