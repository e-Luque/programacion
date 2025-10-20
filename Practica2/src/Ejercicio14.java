import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Lista = new ArrayList<>();
        String x = "Test";
        while(!x.equals("fin")){
            System.out.println("Añada un nombre a la lista (Si quiere parar escriba fin):");
            x=scanner.nextLine();
            Lista.add(x);
            if(x.equals("fin")){
                Lista.removeLast();
            }

        }
        System.out.println("Escriba un nombre para buscar en la lista: ");
        String Nombre = scanner.nextLine();
        if (Lista.contains(Nombre)){
            System.out.println(Nombre+ " está en la lista");
        }
        else{
            System.out.println(Nombre+ " no está en la lista");
        }
    }
}
