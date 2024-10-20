import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del cuadrado: ");
        int N = scanner.nextInt();

        // Dibujar el cuadrado
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Primera y última fila, o primera y última columna
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacios en medio
                }
            }
            System.out.println(); // Nueva línea al final de cada fila
        }

        scanner.close();
    }
}
