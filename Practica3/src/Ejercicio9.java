import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String[][] Tablero = {
               {"a1","a2","a3","a4","a5","a6","a7","a8"},
               {"b1","b2","b3","b4","b5","b6","b7","b8"},
               {"c1","c2","c3","c4","c5","c6","c7","c8"},
               {"d1","d2","d3","d4","d5","d6","d7","d8"},
               {"e1","e2","e3","e4","e5","e6","e7","e8"},
               {"f1","f2","f3","f4","f5","f6","f7","f8"},
               {"g1","g2","g3","g4","g5","g6","g7","g8"},
               {"h1","h2","h3","h4","h5","h6","h7","h8"}
       };
       System.out.print("Escoja la posicion del caballo: ");
       String Posicion = scanner.nextLine();
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                if ((Posicion).equals(Tablero[i][j])){
                    System.out.println("El caballo se podrá mover en las siguientes posiciones: "+((i+1)>=8 || (i+1)<0 || (j-2)>=8 || (j-2)<0 ? "" : Tablero[i+1][j-2]+"  ")+((i-1)>=8 || (i-1)<0 || (j-2)>=8 || (j-2)<0 ? "" :Tablero[i-1][j-2]+"  ")+((i+2)>=8 || (i+2)<0 || (j-1)>=8 || (j-1)<0 ? "" :Tablero[i+2][j-1]+"  ")+((i+2)>=8 || (i+2)<0 || (j+1)>=8 || (j+1)<0 ? "" :Tablero[i+2][j+1]+"  ")+((i+1)>=8 || (i+1)<0 || (j+2)>=8 || (j+2)<0 ? "" :Tablero[i+1][j+2]+"  ")+((i-1)>=8 || (i-1)<0 || (j+2)>=8 || (j+2)<0 ? "" :Tablero[i-1][j+2]+"  ")+((i-2)>=8 || (i-2)<0 || (j-1)>=8 || (j-1)<0 ? "" :Tablero[i-2][j-1]+"  ")+((i-2)>=8 || (i-2)<0 || (j+1)>=8 || (j+1)<0 ? "" :Tablero[i-2][j+1]));
                }
            }
        }
    }
}
