import java.util.Scanner;

public class manosalaobra10 {
    public static void main(String[] args) throws Exception {
        /*
         * EJERCICIO 10
         * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
         * el número
         * ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
         * 5 *****
         * 3 ***
         * 11 ***********
         * 2 **
         */
        
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[4]; // Array para almacenar los 4 números
    
            // Ciclo para leer 4 números comprendidos entre 1 y 20
            for (int i = 0; i < 4; i++) {
                int numero;
                do {
                    System.out.print("Ingrese un número entre 1 y 20: ");
                    numero = scanner.nextInt();
                    
                    if (numero < 1 || numero > 20) {
                        System.out.println("Número fuera de rango. Intente de nuevo.");
                    }
                } while (numero < 1 || numero > 20);
                
                numeros[i] = numero;
            }
    
            // Imprimir cada número seguido de los asteriscos correspondientes
            for (int numero : numeros) {
                System.out.print(numero + " ");
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Salto de línea después de cada número
            }
    
            scanner.close();
        }
}
