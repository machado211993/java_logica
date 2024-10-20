import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 16. Realizar un algoritmo que rellene un vector de tamaño N con valores
         * aleatorios y le pida al
         * usuario un numero a buscar en el vector. El programa mostrará donde se
         * encuentra el
         * numero y si se encuentra repetido
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(n); // random para cargar de manera aleatoria valores
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");

        System.out.println("por favor ingrese un valor a buscar");
        int valor = leer.nextInt();
        int sumador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (valor == vector[i]) {
                sumador = sumador + 1;
                System.out.println("el numero se encuentra en la posicion  " + (i + 1));
            }
        }
        /* espectacular */
    }
}
