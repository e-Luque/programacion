public class Ejercicio1 {
    public static void main(String[] args) {
        //Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla.
        // Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.
        //Creo una tabla donde los valores transparentes sean null
        Double[][] doub = {
                {0.0, 30.0, 2.0, null, null, 5.0},
                {75.0, null, null, null, 0.0, null},
                {null, null, -2.0, 9.0, null, 11.0}
        };
        //Imprimo la tabla
        Double valor = 0.0;
        System.out.printf("%-10s", "Array Num");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-10s", "Columna " + i);
        }
        System.out.println();
        for (int i = 0; i < doub.length; i++) {
            System.out.printf("%-10s", "Fila " + i);
            for (int j = 0; j < doub[i].length; j++) {
                valor = doub[i][j];
                //Si el valor es null lo transparentamos
                if (valor == null) {
                    System.out.printf("%-10s", " ");
                }
                //Y si no, imprime el numero
                else {
                    System.out.printf("%-10s", doub[i][j]);
                }
            }
            //Salto de linea para la siguiente fila
            System.out.print("\n");
        }
    }
}