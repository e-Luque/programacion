import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] Tabla = new int[6][10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                Tabla[i][j] = (int)(Math.random() * (40 - 20 + 1)) + 20;
            }
        }
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                for (int k = i; k < Tabla.length; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < Tabla[k].length; l++) {
                        if (Tabla[i][j] == Tabla[k][l]) {
                            Tabla[k][l]=0;
                        }
                    }
                }
            }
        }


        int Maximo = Tabla[0][0];
        int Minimo = Tabla[0][0];
        int IndiceI_M = 0;
        int IndiceJ_M = 0;
        int IndiceI_m = 0;
        int IndiceJ_m = 0;
        int SumaI = 0;
        int SumaJ = 0;
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                System.out.printf("%-10s", Tabla[i][j]);
                SumaI += Tabla[i][j];
            }
            System.out.println();
        }
        for (int j = 0; j < Tabla[0].length; j++) {
            for (int i = 0; i < Tabla.length; i++) {
                SumaJ += Tabla[i][j];
            }
        }
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                if (Tabla[i][j]>Maximo){
                    Maximo=Tabla[i][j];
                    IndiceI_M = i;
                    IndiceJ_M = j;
                }
            }
        }
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < Tabla[i].length; j++) {
                if (Tabla[i][j]<Minimo && Tabla[i][j]!=0){
                    Minimo=Tabla[i][j];
                    IndiceI_m = i;
                    IndiceJ_m = j;
                }
            }
        }
        System.out.println("El numero máximo es: " + Maximo + " con la posición: " + "["+IndiceI_M+"]" + "["+IndiceJ_M+"]");
        System.out.println("El numero minimo es: " + Minimo + " con la posición: " + "["+IndiceI_m+"]" + "["+IndiceJ_m+"]");
        System.out.println("La suma de filas es: " + SumaI);
        System.out.println("La suma de columnas es: " + SumaJ);
        System.out.println("La suma de filas y columnas es: "+ (SumaI+SumaJ));
    }
}