import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] Letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println("Introduzca la numeracion de su DNI: ");
        int DNI = scanner.nextInt();
        int LetraDNI = DNI%23;
        System.out.println("Su DNI al completo es: "+DNI+Letras[LetraDNI]);
    }
}
