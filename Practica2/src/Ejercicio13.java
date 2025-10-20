import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Cree una lista de enteros (ArrayList<Integer>).
        ArrayList<Integer> Numeros = new ArrayList<>();
        int x = 0;
        int indice = 0;
        //Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
        while (x>=0){
            x = scanner.nextInt();
            Numeros.add(x);
            indice++;
            if (x<0){
                Numeros.remove(indice-1);
            }
        }
        //Muestre por pantalla todos los números de la lista y la suma total de los mismos.
        System.out.println("Lista de Numeros: "+ Numeros.toString());
        int Suma = 0;
        for (int i=0; i<Numeros.size(); i++){
            Suma+=Numeros.get(i);
        }
        System.out.println("La suma de los numeros es: "+ Suma);
    }
}
