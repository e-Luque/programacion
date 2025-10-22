import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Numeros = new ArrayList<>(10);
        for (int i = 0; i< 10; i++){
            System.out.println("Introduce el Nº "+(i+1)+" de la lista");
            int x = scanner.nextInt();
            Numeros.add(x);
        }
        for (int i = 0; i < Numeros.size(); i++) {
            for (int j = 1; j < Numeros.size(); j++) {
                if (Numeros.get(i).equals(Numeros.get(j)) && i != j){
                    Numeros.remove(j);
                    j--;
                }
            }
        }
        System.out.println("La lista de numeros es: "+ Numeros.toString());
    }
}
