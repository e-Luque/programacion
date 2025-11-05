import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] Tabla = new int[4][5];
        Scanner scanner = new Scanner(System.in);
        //Rellenamos la tabla
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                Tabla[i][j] = scanner.nextInt();

            }
        }
        //Definimos las variables
        int SumaTotal = 0;
        int SumaI = 0;
        //Imprimimos la tabla
        for (int i = 0; i < Tabla.length; i++) {
            //Ponemos suma a 0 para que no se vayan sumando cada fila seguida
            SumaI = 0;
            for (int j = 0; j < Tabla[i].length; j++) {
                System.out.printf("%-10s", Tabla[i][j]);
                //Sumamos la Fila y la suma para el total
                SumaI += Tabla[i][j];
                SumaTotal += Tabla[i][j];
            }
            System.out.printf("%-10s", SumaI);
            System.out.println();
        }
        //Buscamos el valor maximo de la columna recorriendola de arriba a abajo.
        for (int j = 0; j < Tabla[0].length; j++) {
            int Maximo = 0;
            for (int i = 0; i < Tabla.length; i++) {
                if (Tabla[i][j] > Maximo) {
                    Maximo = Tabla[i][j];
                }

            }
            //Imprimimos el valor maximo
            System.out.printf("%-10d", Maximo);
        }
        //Y el total
        System.out.printf("%-10s", (SumaTotal));
    }
}
