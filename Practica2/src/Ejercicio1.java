import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Crea un array de 10 posiciones de números con valores pedidos por teclado.
        int[] arrayInt = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Introduce el valor Nº"+(i+1));
            arrayInt[i] = scanner.nextInt();
        }
        //Muestra por consola el índice y el valor al que corresponde.
        for(int i=0; i<10; i++){
            System.out.println("["+i+"]"+" -> "+ arrayInt[i]);
        }

    }
}
