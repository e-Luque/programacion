import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Lista = new ArrayList<>();
        String x = "Test";

        while(!x.equals("fin")){
            System.out.println("Añada un nombre a la lista (Si quiere parar escriba fin):");
            x = scanner.nextLine();
            if (!x.equals("fin")) {
                Lista.add(x);
            }
        }

        System.out.println("Escriba un nombre para buscar en la lista: ");
        String Nombre = scanner.nextLine();
        int indice = Lista.indexOf(Nombre);

        if (indice != -1){
            System.out.println(Nombre + " está en la lista en la posición: " + indice);
        } else {
            System.out.println(Nombre + " no está en la lista");
        }
    }
}