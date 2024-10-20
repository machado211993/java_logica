import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
         * y muestre la
         * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B
         * y se obtiene
         * cambiando sus filas por columnas (o viceversa).
         */
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(20);
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("la trapuesta de la matriz es la siguiente");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }

    }
}
