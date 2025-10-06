import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args) {
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        Scanner scanner = new Scanner(System.in);
        //Crea un array de 10 posiciones de números con valores pedidos por teclado.
        int[] arrayInt = new int[10];
        int Suma,ns;
        int Resta,nr;
        Suma=0;
        Resta=0;
        ns=0;
        nr=0;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Introduce el valor Nº" + (i + 1));
            arrayInt[i] = scanner.nextInt();
        }
        //A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]>0){
                Suma+=arrayInt[i];
                ns++;
            }
            if (arrayInt[i]<0){
                Resta+=arrayInt[i];
                nr++;
            }
        }
        if ((ns==0 ||nr == 0)){
            System.out.println("Faltan numeros negativos o positivos, programa finalizado");
        }
        else{
            int MediaSuma=Suma/ns;
            int MediaResta=Resta/nr;
            System.out.println("Media positiva: "+ MediaSuma);
            System.out.println("Media negativa: "+ MediaResta);
        }

    }

}