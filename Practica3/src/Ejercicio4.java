import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] Tabla = new int [4][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                Tabla[i][j] = (int) (Math.random()*1999);

            }
        }
        int SumaTotal = 0;
        int SumaI = 0;
        for (int i = 0; i < Tabla.length; i++) {
            SumaI=0;
            for (int j = 0; j < Tabla[i].length; j++) {
                System.out.printf("%-10s", Tabla[i][j]);
                SumaI+=Tabla[i][j];
                SumaTotal+=Tabla[i][j];
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%-10s", SumaI);
            System.out.println();
        }
        for (int j = 0; j < Tabla[0].length; j++) {
            int SumaJ = 0;
            for (int i = 0; i < Tabla.length; i++) {
                SumaJ += Tabla[i][j];
                SumaTotal+= Tabla[i][j];
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%-10d", SumaJ);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%-10s", (SumaTotal));
    }

}
