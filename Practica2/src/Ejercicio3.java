import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args){
        //Crea un array que contenga 5 números.
        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Introduce el valor Nº"+(i+1));
            arrayInt[i] = scanner.nextInt();
        }
        //Realiza un programa que te muestre por pantalla SOLO el más pequeño de ellos.
        int menor = arrayInt[0];

        for (int i = 1; i < arrayInt.length; i++) {
            if (arrayInt[i] < menor) {
                menor = arrayInt[i];
            }
        }

        System.out.println("El número menor es el " + menor);
    }
}
