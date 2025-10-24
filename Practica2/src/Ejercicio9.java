import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        int M = 0;
        int m = 0;
        Scanner scanner = new Scanner (System.in);
        //Pida al usuario por teclado 10 números enteros y los guarde en un array
        int[] ListaNumeros = new int[10];
        for(int i=0;i<ListaNumeros.length;i++){
            System.out.println("Escribe el Nº "+(i+1));
            ListaNumeros[i] = scanner.nextInt();
        }
        int menor = ListaNumeros[0];
        int mayor = ListaNumeros[0];
        //Recorra el array para encontrar:

        //El valor mínimo y la posición en la que aparece.
        for (int i = 0; i < ListaNumeros.length; i++) {
            if (ListaNumeros[i] < menor){
                menor = ListaNumeros[i];
                m = i;
            }
        }
        //El valor máximo y la posición en la que aparece.
        for (int i = 0; i < ListaNumeros.length; i++) {
            if (ListaNumeros[i] > mayor) {
                mayor = ListaNumeros[i];
                M = i;
            }
        }
        System.out.println("Valor máximo: "+mayor+" en la posición "+M );
        System.out.println("Valor mínimo: "+menor+" en la posición "+m );
    }
}
