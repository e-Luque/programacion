import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Numeros = new ArrayList<>(10);
        for (int i = 0; i< Numeros.size(); i++){
            int x = scanner.nextInt();
            Numeros.add(x);
        }
        //System.out.println(Numeros.toString());
    }
}
