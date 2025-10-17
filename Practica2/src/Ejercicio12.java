import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] Letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};
        System.out.println("Introduzca la numeracion de su DNI: ");
        int DNI = scanner.nextInt();
        int LetraDNI = DNI%23;
        System.out.println("Su DNI al completo es: "+DNI+Letras[LetraDNI]);
    }
}
